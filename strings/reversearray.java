 import java.util.Scanner;
class reversearray{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
      
      System.out.println("Enter array element :");
      for(int i=0; i<n; i++){
         arr[i] = sc.nextInt();
      }
        int i = 0;
        int j = arr.length-1;
      while(i<j){
        // int temp = arr[i];
         arr[i] =arr[i]+ arr[j];
         arr[j] = arr[i]- arr[j]; 
         arr[i] =arr[i]- arr[j];
         i++;
         j--;
      }
      for (int element : arr) {
         System.out.print(element+" ");
      }
   }
}     