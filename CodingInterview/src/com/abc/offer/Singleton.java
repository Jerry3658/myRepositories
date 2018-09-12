package com.abc.offer;
/**
 * 面试题2：实现Singleton模式
 * 题目：设计一个类，我们只能生成该类的一个实例。
 * @author Jerry
 *
 */
public class Singleton {
	/**
	 * 饿汉式(开发)
	 * 注意：为方便几种方式的比较，把它们写在同一个外部类里面，所以都定义成静态内部类，
	 * 若想要分成单独的类，则把static关键字去掉即可。
	 * @author Jerry
	 *
	 */
	public static class Singleton1 {
		// 私有的构造器
		private Singleton1() {}

		private static Singleton1 instance = new Singleton1();

		public static Singleton1 getInstance() {
			return instance;
		}
	}
	
	/**
	 * 懒汉式(面试)
	 * @author Jerry
	 *
	 */
	public static class Singleton2 {
		private Singleton2() {}

		private static Singleton2 instance = null;

		public static Singleton2 getInstance() {
			if (instance == null)
				instance = new Singleton2();
			return instance;
		}
	}

	/**
	 * 使用同步方法
	 * 
	 * @author Jerry
	 *
	 */
	public static class Singleton3 {
		private Singleton3() {}

		private static Singleton3 instance = null;

		// 对获取实例的方法进行同步
		public static synchronized Singleton3 getInstance() {
			if (instance == null)
				instance = new Singleton3();
			return instance;
		}
	}

	/**
	 * 使用双重同步锁
	 * @author Jerry
	 *
	 */
	public static class Singleton4 {
		private Singleton4() {}

		private static Singleton4 instance = null;

		public static Singleton4 getInstance() {
			if (instance == null) {
				synchronized (Singleton4.class) {
					if (instance == null)
						instance = new Singleton4();
				}
			}
			return instance;
		}
	}
}
