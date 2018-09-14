package com.abc.offer;
/**
 * 单链表的结点
 * @author Jerry
 *
 */
public class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}
}
