
public class Array {
	
	static void arrayMethod() {
		
		int sum = 0;
		int array[] = {10,23,4,5,3,230,4,345,35,335};
		
		for(int num:array) {
			sum = sum + num;
		}
		
		array[3] =1000;
		
		for(int num:array) {
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.print("The sum is: "+sum);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		arrayMethod();

	}

}
