package Trees;

public class InsertBT {
	
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	public void insert(Node node, int data) {
		if(data < node.data) {
			if(node.left != null) {
				insert(node.left, data);
			} else {
				System.out.println("  Inserted " + data + " to left of Node " + node.data);  
				node.left = new Node(data);
			}
		}else if(data > node.data) {
			if(node.right != null) {
				insert(node.right, data);
			}else {
			       System.out.println("  Inserted " + data + " to right of Node " + node.data);  
				node.right = new Node(data);
			}
		}
	}

	public static void main(String[] args) {
		InsertBT obj = new InsertBT();
		Node root = new Node(20);
		obj.insert(root, 12);
		obj.insert(root, 21);
		obj.insert(root, 5);
		obj.insert(root, 10);
		obj.insert(root, 30);
		obj.insert(root, 40);
		obj.insert(root, 34);
		obj.insert(root, 28);
		
		System.out.println(root.data);

	}

}
