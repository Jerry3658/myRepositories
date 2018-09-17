package com.abc.offer;
/**
 * 链式二叉树结点
 * @author Jerry
 *
 */
public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int val) {
		this.val = val;
	}
	@Override
	public String toString() {
		return "TreeNode [val=" + val + ", left=" + left + ", right=" + right + "]";
	}
}
