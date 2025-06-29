package DataStructures;

class Node{
	int data;
	Node next;
	
	Node(int new_data){
		data = new_data;
		next = null;
	}
	
}
public class linkedList {
	
	
	public static Node insertAtFront(Node head, int data) {
		Node current = head;
		
		Node newNode = new Node(data);
		newNode.next = head;
		
		return newNode;
	}
	
	public static void printList(Node head) {
		Node current = head;
		while(current != null) {
			System.out.print(" " + current.data);
			current = current.next;
		}
	}

	public static void main(String[] args) {
		
		Node head = new Node(2);
		head.next = new Node(3);
		head.next.next = new Node(4);
		head.next.next.next = new Node(5);
		
		int data = 1;
		head = insertAtFront(head, data);
		
		printList(head);

	}

}
