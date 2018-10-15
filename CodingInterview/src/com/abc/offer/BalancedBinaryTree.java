package com.abc.offer;
/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * 平衡二叉树的定义：它是一棵空树或它的左右两个子树的高度差的绝对值不超过1，并且左右两个子树都是一棵平衡二叉树。
 * @author Jerry
 *
 */
public class BalancedBinaryTree {

	public boolean IsBalanced_Solution(TreeNode root) {
		if (root == null)
			return true;
		if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1)
			return false;
		return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
	}

	public int getHeight(TreeNode root) {
		if (root == null)
			return 0;
		return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	}

}
