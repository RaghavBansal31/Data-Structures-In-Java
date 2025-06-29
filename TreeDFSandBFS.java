package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeDFSandBFS {
	int count,count2,count3 =0;
	static class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			this.left = this.right = null;
		}
	}
	
//	public void print() {
//		System.out.println("This is the node: " + root.data);
//		System.out.println("This is the node: " + root.left.data);
//		System.out.println("This is the node: " + root.right.data);
//		System.out.println("This is the node: " + root.right.left.data);
//		System.out.println("This is the node: " + root.right.right.data);
//		System.out.println("This is the node: " + root.left.right.data);
//		System.out.println("This is the node: " + root.right.right.left.data);
//	
//	}
	
	Node root;
	public void insert(int data) {
		root = insertRec(root,data);
	
	}

	private Node insertRec(Node root, int data) {
		if(root == null) {
			root = new Node(data);
			return root;
		}
		
		if(data < root.data) {
			root.left = insertRec(root.left,data);
			
		} else if(data > root.data) {
			root.right = insertRec(root.right, data);
			
		}
		
		return root;
	}
	
	public void inOrder() {
		inOrderRec(root);
		System.out.println();
		preOrderRec(root);
		System.out.println();
		postOrderRec(root);
		
	}

	//DFS Post-Order Traversal left - right - root
	private void postOrderRec(Node root) {
		if(root != null) {
			postOrderRec(root.left);
			postOrderRec(root.right);
			System.out.print(root.data + " ");
		}
		
	}

	//DFS Pre-Order Traversal  root - left - right
	private void preOrderRec(Node root) {
		if(root != null) {
			System.out.print(root.data + " ");
			preOrderRec(root.left);
			preOrderRec(root.right);
		}
		
	}

	//DFS in order Traversal left - root - right
	private void inOrderRec(Node root) {
		if(root != null) {
			inOrderRec(root.left);
			System.out.print(root.data + " ");
			inOrderRec(root.right);
			
		}
		
		
	}
	
	public void bfs() {
		bfsRec(root);
	}

	private static void bfsRec(Node root) {
		if(root == null) {return;}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			Node node = q.poll();
			System.out.print(node.data + " ");
			if(node.left != null) { q.add(node.left);}
			if(node.right != null) {q.add(node.right);}
		}
		
	}

	public static void main(String[] args) {
		TreeDFSandBFS obj = new TreeDFSandBFS();
		
		
		obj.insert(5);
		obj.insert(10);
		obj.insert(25);
		obj.insert(48);
		obj.insert(35);
		obj.insert(12);
		obj.insert(9);
		
	//	obj.print();
		
		obj.inOrder();
		System.out.println();
		
		obj.bfs();
		
		

	}

}
