package io.arun.learning.dsa.binarytree;

public class BinaryTreeNode {

	BinaryTreeNode left,right;
	int data;
	
	public BinaryTreeNode() {
		this.left = null;
		this.right = null;
		this.data = 0;
	}

	public BinaryTreeNode(int data) {
		this.left = null;
		this.right = null;
		this.data = data;
	}
	
	public void setLeft(BinaryTreeNode node) {
		this.left = node;
	}
	
	public void setRight(BinaryTreeNode node) {
		this.right = node;
	}
	
	public BinaryTreeNode getLeft() {
		return this.left;
	}
	
	public BinaryTreeNode getRight() {
		return this.right;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	
}
