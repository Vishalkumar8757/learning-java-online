import java.util.Scanner;

public class input {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);

        int[] ar = new int[5];
        // default vaule print karwane ke liye
        for(int i=0 ;i<ar.length; i++){
            System.out.print(ar[i]+" ");
        }

        // input
        for(int i = 0; i<5 ; i++){
            ar[i] = sc.nextInt();
        }

        //output 
        for(int i=0; i<5; i++){
            System.out.print(ar[i]*2+" ");
        }
    }
}
