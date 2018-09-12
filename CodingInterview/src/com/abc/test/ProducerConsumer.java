package com.abc.test;
/**
 * 生产者消费者问题
 * @author Jerry
 *
 */
public class ProducerConsumer {
	public static void main(String[] args) {
		SyncStack ss = new SyncStack();
		Producer p = new Producer(ss);
		Consumer c = new Consumer(ss);
		new Thread(p).start();
		new Thread(c).start();
	}
}

/**
 * 窝头类：一个篮子里面的馒头
 * @author Jerry
 *
 */
class WoTou{
	// 给每一个窝头标记一个id
	int id;
	public WoTou(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "WoTou [id=" + id + "]";
	}
}

/**
 * 利用栈来模拟存放窝头的篮子
 * @author Jerry
 *
 */
class SyncStack{
	int index = 0;
	// 可以装6个馒头
	WoTou[] arrWT = new WoTou[6];
	/**
	 * 放窝头：锁住该方法，防止多线程访问，造成前后结果不一致
	 * @param wt
	 */
	public synchronized void push(WoTou wt) {
		while(index == arrWT.length) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 如果有多个线程 改为notifyAll即可
		this.notify();
		// 放入一个窝头
		arrWT[index] = wt;
		// 标记++，以便下次存放窝头
		index++;
	}
	
	/**
	 * 取窝头：锁住该方法，防止多线程访问，造成前后结果不一致
	 * @return
	 */
	public synchronized WoTou pop() {
		while(index == 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notify();
		index--;
		return arrWT[index];
	}
}

/**
 * 生产者
 * @author Jerry
 *
 */
class Producer implements Runnable {

	SyncStack ss = null;
	
	public Producer(SyncStack ss) {
		this.ss = ss;
	}

	@Override
	public void run() {
		for(int i = 0; i<20; i++) {
			WoTou wt = new WoTou(i);
			ss.push(wt);
			System.out.println("生产了：" + wt);
			try {
				Thread.sleep((int) (Math.random()*1000));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

/**
 * 消费者
 * @author Jerry
 *
 */
class Consumer implements Runnable {

	SyncStack ss = null;
	public Consumer(SyncStack ss){
		this.ss = ss;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<20; i++) {
			WoTou wt = ss.pop();
			System.out.println("消费了：" + wt);
			try {
				Thread.sleep((int) (Math.random()*1000));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}