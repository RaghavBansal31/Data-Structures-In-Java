import java.util.Stack;

public class StackClass {
	
	public static void add(Stack<Integer> stack, int value) {
		stack.push(value);
	}
	
	public static void Peek(Stack<Integer> stack) {
		System.out.print(stack.toString());
		
	}
	
	public static void Pop(Stack<Integer> stack) {
		if(!stack.isEmpty()) {
			stack.pop();
		}else {
			System.out.println("The stack is empty");
		}
	}
	
	

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		Pop(stack);
		add(stack, 10);
		add(stack, 2);
		add(stack, 12);
		add(stack, 114);
		add(stack, 16);
		add(stack, 1120);
		Pop(stack);
		Peek(stack);

	}

}
