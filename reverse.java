package DataStructures;

public class reverse {
	
static Node reverseList(Node head) {
	
	Node current = head;
	Node previous = null;
	Node next = null;
	
	while(current != null){
		next = current.next;
		current.next = previous;
		previous = current;
		current = next;
	}
	
	return previous;
}
        
static void printLinst(Node head) {
	Node current = head;
	while(current != null) {
		System.out.print(" " + current.data);
		current = current.next;
	}
	System.out.println();
}
     

	public static void main(String[] args) {
		Node head = new Node(3);
		head.next = new Node(4);
		head.next.next = new Node(58);
		head.next.next.next = new Node(489);
		head.next.next.next.next = new Node(39);
		
		printLinst(head);
		head = reverseList(head);
		printLinst(head);

	}

}
