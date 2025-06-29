package DataStructures;

class NodeTest{
	int data;
	NodeTest next;
	
	NodeTest(int data){
		this.data = data;
		next = null;
	}
}
public class Practice {
	
	public static int Middle(NodeTest head) {
		NodeTest current = head;
		int count = 0;
		int mid = 0;
		
		while(current != null) {
			count++;
			current = current.next;
		}
		
		if(count % 2 == 0) {
			mid = count/2;
		}else {
			mid = (count + 1)/2;
		}
		
		return mid;
	}
	
	public static int middle(NodeTest head) {
		
		int count = Middle(head);
		
		NodeTest current = head;
		for(int i = 1 ; i < count && current != null;i++) {
			current = current.next;
		}
		
		int result = current.data;
		return result;
		
		
	}
		
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NodeTest head = new NodeTest(1);
		head.next = new NodeTest(2);
		head.next.next = new NodeTest(3);
		head.next.next.next = new NodeTest(4);
		head.next.next.next.next = new NodeTest(66);
		head.next.next.next.next.next = new NodeTest(98);
	
		
		int result = middle(head);
		System.out.print(result);
       
	
	}

}
