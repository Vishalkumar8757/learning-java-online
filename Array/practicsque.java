// import java.util.Arrays;

public class practicsque {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90};
        print(arr);
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
            arr[i] = arr[i]+10;
            }
            else{
            arr[i] = arr[i]*2; 
            }
            // System.out.print(arr[i]+" ");
        } 
         print(arr);  
    }
    public static void  print(int[] arr) {
        for(int i=0; i<arr.length; i++){
           System.out.print(arr[i]+" ");  
        }
        System.out.println();
    }
     
}
