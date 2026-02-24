import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter array size");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array element : ");
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }
        System.out.print("Enter target number");
        int target = s.nextInt();

        boolean flag = false;
        for(int i=0; i<n; i++){
           if(arr[i] ==  target){
            flag = true;
            break;
           }
        }
        if(flag==true){
            System.out.println("Target found");
        }
        else{
            System.out.println("Target  not found"); 
        }
    }
}
