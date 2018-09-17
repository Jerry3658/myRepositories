package com.abc.offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 面试题6：从尾到头打印链表
 * 题目：输入一个链表的头结点，从尾到头反过来打印出每个结点的值。
 * @author Jerry
 *
 */
public class PrintListInReversedOrder {

	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		Stack<Integer> stack = new Stack<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (listNode != null) {
			stack.push(listNode.val);
			listNode = listNode.next;
		}
		while (!stack.isEmpty()) {
			list.add(stack.pop());
		}
		return list;
	}

	public static void main(String[] args) {
		
		ListNode node5 = new ListNode(5);
		ListNode node4 = new ListNode(4, node5);
		ListNode node3 = new ListNode(3, node4);
		ListNode node2 = new ListNode(2, node3);
		ListNode node1 = new ListNode(1, node2);
		
		ArrayList<Integer> list = printListFromTailToHead(node1);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
