package com.abc.offer;
/**
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 * @author Jerry
 *
 */
public class NextNode {
	public TreeLinkNode GetNext(TreeLinkNode pNode) {
		if (pNode == null)
			return null;
		// 有右子树
		if (pNode.right != null) {
			// 找右子树的最左子结点
			pNode = pNode.right;
			while (pNode.left != null)
				pNode = pNode.left;
			return pNode;
		}
		// 没有右子树
		while (pNode.next != null) {
			if (pNode.next.left == pNode)
				return pNode.next;
			pNode = pNode.next;
		}
		return null;
	}
}
