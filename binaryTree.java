package Trees;

public class binaryTree {
	
	static class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			this.left = this.right = null;
		}
	}
	Node root;
	public void insertNode( int data){
		root = insertNodeRec(root, data);
		
	}

	private Node insertNodeRec(Node root, int data) {
		if(root == null) {
			root = new Node(data);
			return root;
		}
		
		if(data < root.data) {
			root.left = insertNodeRec(root.left, data);
		} else if(data > root.data) {
			root.right = insertNodeRec(root.right, data);
		}
		return root;
	}
	
	public void inOrder() {
		inOrderRec(root);
	}

	private void inOrderRec(Node root) {
		if(root != null) {
			inOrderRec(root.left);
			System.out.print(root.data + " ");
			inOrderRec(root.right);
		}
	}
		
	public boolean search(int searchData) {
		return searchFunc(root,searchData);
	}
		
	

	private boolean searchFunc(Node root, int searchData) {
		if(root == null) {
			return false;
		}
		if(searchData == root.data) {
			return true;
		}
		
		if(searchData < root.data) {
			return searchFunc(root.left, searchData);
		}else {
			return searchFunc(root.right, searchData);
		}
		
	}
	
	public int minValue() {
		return minValueRec(root);
	}

	private int minValueRec(Node root) {
		if(root == null) {
			throw new IllegalStateException("Tree is Empty");
		}
		if(root.left == null) {
			return root.data;
		}
		return minValueRec(root.left);
	}

	public int MaxValue() {
		return maxValueRec(root);
	}
	private int maxValueRec(Node root) {
	    if(root == null) {
	    	throw new IllegalStateException("Tree is Empty");
	    }
	    if(root.right == null) {
	    	return root.data;
	    }
		return maxValueRec(root.right);
	}
	
	

	public static void main(String[] args) {
		
		binaryTree obj = new binaryTree();
		obj.insertNode(10);
		obj.insertNode(26);
		obj.insertNode(5);
		obj.insertNode(100);
		obj.insertNode(12);
		obj.insertNode(15);
		obj.insertNode(30);
		
		obj.inOrder();
		
		obj.search(5);
		System.out.println();
		System.out.println("The Minimum Value in the Tree is: " + obj.minValue());
		System.out.println("The Maximum Value in the Tree is: " + obj.MaxValue());
		

	}

}
