import java.util.*;

public class arraylist {

	static void arraylistMethod() {
		int sum = 0;
		ArrayList<Integer> list1 = new ArrayList<>(List.of(12,21,124,1356,74,345,45,434));
		
		for(int number:list1) {
			sum = sum + number;
		}
		
		list1.set(2, 120000);
		list1.set(5, 200000);
		
		System.out.println("The sum of the ArrayList before change: "+sum);
		
		for(int number:list1) {
			System.out.print(number+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arraylistMethod();

	}

}
