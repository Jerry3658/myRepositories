package com.abc.offer;
/**
 * 面试题8：二叉树的下一个结点
 * 题目：给定一棵二叉树和其中的一个结点，如何找出中序遍历顺序的下一个结点？
 * 树中的结点除了有两个分别指向左右子结点的指针以外，还有一个指向父结点的指针。
 * @author Jerry
 *
 */
public class NextNodeInBinaryTrees {
	public static TreeLinkNode GetNext(TreeLinkNode pNode) {

		if (pNode == null)
			return null;
		// 节点有右子树
		if (pNode.right != null) {
			pNode = pNode.right;
			while (pNode.left != null) {
				pNode = pNode.left;
			}
			return pNode;
			// 节点没有右子树
		} else if (pNode.next != null && pNode == pNode.next.left) {
			return pNode.next;
			// 节点没有右子树，还是父节点的右子节点
		} else if (pNode.next != null && pNode == pNode.next.right) {
			while (pNode.next != null && pNode != pNode.next.left) {
				pNode = pNode.next;
			}
			return pNode.next;
		} else
			// 节点无父节点，即为根节点
			return pNode.next;
	}
}
