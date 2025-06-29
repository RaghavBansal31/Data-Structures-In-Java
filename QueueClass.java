import java.util.LinkedList;
import java.util.Queue;


public class QueueClass {
	
	public static void add(Queue<String> que, String value) {
		que.offer(value);
	}
	
	public static void Peek(Queue<String> que) {
		System.out.print(que.toString());
		
	}
	
	public static void Pop(Queue<String> que) {
		if(!que.isEmpty()) {
			que.poll();
		}else {
			System.out.println("The Queue is empty");
		}
	}
	
	

	public static void main(String[] args) {
		Queue<String> que = new LinkedList<>();
		
		Pop(que);
		add(que,"Gabru");
		add(que,"Don");
		add(que,"is");
		add(que,"great");
		add(que,"I am ");
		add(que,"not");
		Peek(que);
		
	}

}
