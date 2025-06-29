package DataStructures;

public class searchLinkedList {
	
	public static int search(Node head, int data) {
		int result = 0;
		int count = 0;
		
		Node current = head;
		while(current != null) {
			if(current.data == data) {
				count++;
				result = current.data;
			}
			current = current.next;
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head = new Node(5);
		head.next = new Node(56);
		head.next.next = new Node(9);
		head.next.next.next = new Node(10);
		
		int data = 10;
		int output = search(head,data);
		
		System.out.println("The key is found at index: " + output);

	}

}
