package com.abc.offer;

public class TreeLinkNode {
	int val;
	TreeLinkNode left = null;
	TreeLinkNode right = null;
	TreeLinkNode next = null;

	/*TreeLinkNode(int val) {
		this.val = val;
	}
*/
	public TreeLinkNode(int val, TreeLinkNode left, TreeLinkNode right, TreeLinkNode next) {
		this.val = val;
		this.left = left;
		this.right = right;
		this.next = next;
	}

	public void setLeft(TreeLinkNode left) {
		this.left = left;
	}

	public void setRight(TreeLinkNode right) {
		this.right = right;
	}

	public void setNext(TreeLinkNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "TreeLinkNode [next=" + next + "]";
	}
	
}
