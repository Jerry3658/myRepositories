package com.abc.test;

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
