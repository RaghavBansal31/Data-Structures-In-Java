
public class ReverseArrayEfficient {
    
    static void reverse(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    
       for(int num:arr){
           System.out.print(num+" ");
       }
    }
  
    
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
        reverse(arr,0,arr.length-1);
       
        
    }
}