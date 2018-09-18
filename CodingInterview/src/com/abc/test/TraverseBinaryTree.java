package com.abc.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的三种遍历方式
 * @author Jerry
 *
 */
public class TraverseBinaryTree {

	private List<Node> list = new ArrayList<Node>();
	private Node root;

	private TraverseBinaryTree() {
		init();
	}

	// 树的初始化：先从叶子节点开始，由叶到根
	public void init() {
		Node E = new Node("E", null, null);
		Node D = new Node("D", null, E);
		Node C = new Node("C", D, null);
		Node B = new Node("B", null, null);
		Node A = new Node("A", B, C);
		root = A;
	}

	// 定义节点类
	private class Node {
		private String data;// 节点的值
		private Node lchild;// 左孩子指针
		private Node rchild;// 右孩子指针

		// 带参数的构造器
		public Node(String data, Node lchild, Node rchild) {
			this.data = data;
			this.lchild = lchild;
			this.rchild = rchild;
		}
	}

	/**
	 * 对二叉树进行先序遍历 结果存到list中
	 * @param node
	 * @return
	 */
	public List<Node> preOrderTraverse(Node node) {
		// 判断不为空
		if (node != null) {
			list.add(node);
			// System.out.println(node.data);
			if (null != node.lchild)
				preOrderTraverse(node.lchild);
			if (null != node.rchild)
				preOrderTraverse(node.rchild);
		}
		return list;
	}

	/**
	 * 对二叉树进行中序遍历 结果存到list中
	 * @param node
	 * @return
	 */
	public List<Node> inOrderTraverse(Node node) {
		// 判断不为空
		if (node != null) {
			if (null != node.lchild)
				preOrderTraverse(node.lchild);
			list.add(node);
			if (null != node.rchild)
				preOrderTraverse(node.rchild);
		}
		return list;
	}

	/**
	 * 对二叉树进行后序遍历 结果存到list中
	 * @param node
	 * @return
	 */
	public List<Node> postOrderTraverse(Node node) {
		// 判断不为空
		if (node != null) {
			if (null != node.lchild)
				preOrderTraverse(node.lchild);
			if (null != node.rchild)
				preOrderTraverse(node.rchild);
			list.add(node);
		}
		return list;
	}

	public static void main(String[] args) {
		TraverseBinaryTree tree = new TraverseBinaryTree();
		tree.preOrderTraverse(tree.root);
//		tree.inOrderTraverse(tree.root);
//		tree.postOrderTraverse(tree.root);
		for (Node node : tree.list) {
			System.out.print(node.data);
		}
	}
}
