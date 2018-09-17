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

	public ListNode(int val, ListNode next) {
		super();
		this.val = val;
		this.next = next;
	}

}
