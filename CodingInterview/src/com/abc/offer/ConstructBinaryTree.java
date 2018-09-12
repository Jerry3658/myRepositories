package com.abc.offer;

/**
 * 面试题7：重建二叉树
 * 题目：输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入
 * 前序遍历序列{1,2, 4, 7, 3, 5, 6, 8}和中序遍历序列{4, 7, 2, 1, 5, 3, 8, 6}，
 * 则重建出图2.6所示的二叉树并输出它的头结点。
 * @author Jerry
 *
 */
public class ConstructBinaryTree {

	/**
	 * 重建二叉树的方法
	 * @param pre
	 * @param in
	 * @return
	 */
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		return reConstructBinaryTree(pre, 0, pre.length-1, in, 0, in.length-1);
	}
	
	/**
	 * 重写重建二叉树的方法
	 * @param pre
	 * @param startPre
	 * @param endPre
	 * @param in
	 * @param startIn
	 * @param endIn
	 * @return
	 */
	public TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
		if(startPre > endPre || startIn > endIn)
			return null;
		// 根节点
		TreeNode root = new TreeNode(pre[startPre]);
		for(int i = 0; i <= endIn; i++) {
			if(pre[startPre] == in[i]) {
				// 左子树
				root.left = reConstructBinaryTree(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
				// 右子树
				root.right = reConstructBinaryTree(pre, startPre + i - startIn + 1, endPre, in, i + 1, endIn);
				break;
			}
		}
		return root;
	}
	
	public static void main(String[] args) {
		int[] pre = { 1, 2, 4, 7, 3, 5, 6, 8 };
		int[] in = { 4, 7, 2, 1, 5, 3, 8, 6 };
		TreeNode treeNode = new ConstructBinaryTree().reConstructBinaryTree(pre, in);
		System.out.println(treeNode);
	}

}
