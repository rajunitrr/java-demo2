package com.raju.trees;

public class BinaryTreeImp {

	static Node root;
	
	public static void main(String[] args) {

		 root=createTree();
		 display(root);
		 
		 System.out.println("height "+height(root));
	}
	
	private static void display(Node root) {
		
		Node temp=root;
		while(temp!=null) {
			System.out.println(temp.data);
			if(temp.left!=null) {
				temp=temp.left;
			}else {
				temp=temp.right;
			}
		}
		
	}

	// height or depth of the tree
	private static int height(Node root) {
		if (root == null)
			return 0;
		else {
			int left = height(root.left);
			int right = height(root.right);

			return (left > right ? left : right) + 1;
		}
	}
	
	private static Node createTree() {
		
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.left.left.left=new Node(6);
		
		return root;
		
		
	}

}
