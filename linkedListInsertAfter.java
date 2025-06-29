package DataStructures;

public class linkedListInsertAfter {
	
	public static Node insertAfter(Node head, int key, int data) {
		Node current = head;
		while(current != null){
			if(current.data == key) {
				break;
			}
			current = current.next;
		}
			
			if(current == null) {
				return head;
			}else {
				Node newNode = new Node(data);
				newNode.next = current.next;
				current.next = newNode;
				return head;
			}
			
		
		
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
		
		int data = 1;
		head = insertAfter(head,4, data);
		printList(head);

	}

}
