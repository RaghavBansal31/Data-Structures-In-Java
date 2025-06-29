package DataStructures;

public class linkedListInsertBefore {

	public static Node insertBefore(Node head, int key, int data) {
		
		if(head == null) {
			return null;
		}
		
		if(head.data == key) {
			Node newNode = new Node(data);
			newNode.next = head;
			return newNode;
		}
		
		Node current = head;
		Node prev = null;
		
		while(current != null && current.data != key) {
			prev = current;
			current = current.next;
		}
		
		if(current != null) {
			Node newNode = new Node(data);
			prev.next = newNode;
			newNode.next = current;
		}
		
		return head;
	}
	
	public static void printList(Node head) {
		Node current = head;
		while(current != null) {
			System.out.print(" " + current.data);
			current = current.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(2);
		head.next = new Node(3);
		head.next.next = new Node(4);
		head.next.next.next = new Node(5);
		
		int data  = 7;
		head = insertBefore(head, 4, data);
		printList(head);

	}

}
