public class EvenArray {
    
    static int[] evenArray(int arr[]){
        int evenArray[] = new int[10];
        int index = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                evenArray[index] = arr[i];
                index++;
            }
        }
        
        return evenArray;
    }
    
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        int result[] = evenArray(arr);
        for(int i = 0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
        
    }
}