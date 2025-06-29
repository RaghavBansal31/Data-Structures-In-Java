class Node{
    int data;
    Node next;
    
    Node(int new_data){
        data = new_data;
        next = null;
    }
}
class linkedlist {
	
	// Insert a node at the beginning
	public static Node insertAtFront(Node head, int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		return new_node;
		
	}
	
	// Insert a node at end
	public static Node insertAtEnd(Node head, int new_data) {
		Node new_node = new Node(new_data);
		Node cur = head;
		
		while(cur.next != null) {
			cur = cur.next;
		}
		
		cur.next = new_node;
		return head;
	}
    
	// Insert a node at the end
    public static Node insertAtWherever(Node head, int new_data, int key){
        
    	Node cur = head;
        while(cur != null){
        	if(cur.data == key)
        		break;
            cur = cur.next;
        }
        
        if (cur == null)
            return head;
        
        Node new_node = new Node(new_data);
        new_node.next = cur.next;
        cur.next = new_node;
        return head;
    }
    
    // Delete Node
    
    // Delete Node at the Front
    public static Node deleteAtFront(Node head) {
    	head = head.next;
    	return head;
    }
    
    //Delete Node at the End
    public static Node deleteAtEnd(Node head) {
    	Node cur = head;
    	while(cur.next.next != null) {
    		cur = cur.next;
    	}
    	cur.next = null;
    	return head;
    }
    
    // Delete Node after the given key
    public static Node deleteAtWherever(Node head, int key) {
    	Node previous = null;
    	Node cur = head;
    	
    	while(cur != null && cur.data != key) {
    		previous = cur;
    		cur = cur.next;
    	}
    	previous.next = cur.next;
    	return head;
    }
    
    public static void printList(Node head){
        
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        
        int key = 5;
        
        
        // Print original linked list
        printList(head);
        
        //print linked list with the node inserted  at the end
        int data = 400;
        head = insertAtWherever(head,data,key);
        printList(head);
        
        // print linked list with the node inserted at the beginning
        int data2 = 20;
        head = insertAtFront(head, data2);
        printList(head);
        
        // print linked list with the node inserted at the end
        int data3 = 56;
        head = insertAtEnd(head,data3);
        printList(head);
        
        //print linked list with node deleted at the front
        head = deleteAtFront(head);
        printList(head);
        
      //print linked list with node deleted at the End
        head = deleteAtEnd(head);
        printList(head);
        
      //print linked list with node deleted wherever
        int key2 = 4;
        head = deleteAtWherever(head,key2);
        printList(head);
        
        
       
    }
}