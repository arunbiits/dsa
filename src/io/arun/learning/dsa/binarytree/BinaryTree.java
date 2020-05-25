/**
 * 
 */
package io.arun.learning.dsa.binarytree;

/**
 * @author Arun Kumar
 *
 */
public class BinaryTree {

	private BinaryTreeNode root;
	
	public BinaryTree() {
		this.root = null;
	}
	
	public Boolean isEmpty() {
		return root == null;
	}
	
	public void insert(int data) {
		root = insert(root,data);
	}
	
	private BinaryTreeNode insert(BinaryTreeNode node, int data) {
		if (node == null) {
			node = new BinaryTreeNode(data);
		} else {
			if(node.getRight() == null) {
				node.right = insert(node.right,data);
			} else {
				node.left = insert(node.left,data);
			}
		}
		return node;
	}
	
	public int countNodes() {
		return countNodes(root);
	}
	
	private int countNodes(BinaryTreeNode node) {
		if(node == null) {
			return 0;
		} else {
			int l = 1;
			l += countNodes(node.getLeft());
			l += countNodes(node.getRight());
			return l;
		}
	}
	
	public boolean search(int value) {
		return search(root,value);
	}
	
	private boolean search(BinaryTreeNode node, int value) {
		if(node.getData() == value) {
			return true;
		}
		if(node.getLeft() != null) {
			if(search(node.getLeft(),value)){
				return true;
			}
		}
		if(node.getRight() != null) {
			if(search(node.getRight(),value)) {
				return true;
			}
		}
		return false;
	}
	
	public void inorder() {
		inorder(root);
	}
	
	private void inorder(BinaryTreeNode node) {
		if(node != null) {
			inorder(node.getLeft());
			System.out.print(node.getData()+" ");
			inorder(node.getRight());
		}
	}
	
	public void preorder() {
		preorder(root);
	}
	
	private void preorder(BinaryTreeNode node) {
		if(node != null) {
			System.out.print(node.getData()+" ");
			preorder(node.getLeft());
			preorder(node.getRight());
		}
	}
	
	public void postorder() {
		postorder(root);
	}
	
	private void postorder(BinaryTreeNode node) {
		if(node != null) {
			postorder(node.getLeft());
			postorder(node.getRight());
			System.out.print(node.getData()+" ");
		}
	}
}
