import java.util.Scanner;
import java.util.Stack;

public class check_brackets {
	
	static void checkBrackets() {
		String expression;
		char ch;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the expression: ");
		expression = s.next();
		
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0;i<expression.length();i++) {
			ch = expression.charAt(i);
			
			if(ch == '('|| ch =='['|| ch == '{') {
				stack.push(ch);
			}else if(ch ==')') {
				if(stack.isEmpty() || stack.pop() != '(') {
					System.out.println("Brackets Unbalanced");
					return;
				}
			}else if(ch ==']') {
				if(stack.isEmpty() || stack.pop() != '[') {
					System.out.println("Brackets Unbalanced");
					return;
				}
			}
			else if(ch =='}') {
				if(stack.isEmpty() || stack.pop() != '{') {
					System.out.println("Brackets Unbalanced");
					return;
				}
			}
		}
		
		if(stack.isEmpty()) {
			System.out.println("Brackets balanced");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		checkBrackets();

	}

}
