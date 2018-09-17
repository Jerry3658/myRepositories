package com.abc.offer;

import java.util.Deque;
import java.util.LinkedList;
/**
 * 面试题9：用两个栈实现队列
 * 题目：用两个栈实现一个队列。队列的声明如下，请实现它的两个函数appendTail
 * 和deleteHead，分别完成在队列尾部插入结点和在队列头部删除结点的功能。
 * Stack类已过时，应优先使用Deque接口。
 * @author Jerry
 *
 */
public class QueueWithTwoStacks2 {

	static Deque<Integer> deque1 = new LinkedList<Integer>();
	static Deque<Integer> deque2 = new LinkedList<Integer>();
	
	public static void push(int node) {
//		deque1.push(node);
		deque1.addFirst(node);
	}

	public static int pop() {
		if (deque1.isEmpty() && deque2.isEmpty())
			throw new RuntimeException("Queue is empty!");
		if (deque2.isEmpty()) {
			while (!deque1.isEmpty()) {
//				deque2.push(deque1.pop());
				deque2.addFirst(deque1.removeFirst());
			}
		}
//		return deque2.pop();
		return deque2.removeFirst();
	}

	public static void main(String[] args) {
		push(1);
		push(2);
		push(3);
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
	}
}
