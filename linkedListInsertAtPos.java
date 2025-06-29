package DataStructures;

public class linkedListInsertAtPos {
	
	public static Node insertAtPos(Node head, int pos, int data) {
		Node newNode = new Node(data);
		
		if(pos == 1) {
			newNode.next = head;
			return newNode;
		}
		
		Node current = head;
		for(int i = 1 ; i < pos -1 && current!=null;i++) {
			current = current.next;
		}
		
		if(current == null) {
			System.out.println("Position out of bounds");
			return head;
		}
		
		newNode.next = current.next;
		current.next = newNode;
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
		Node head = new Node(3);
		head.next = new Node(4);
		head.next.next = new Node(7);
		head.next.next.next = new Node(9);
		
		int data = 34;
		head = insertAtPos(head, 2,data);
		printList(head);

	}

}
