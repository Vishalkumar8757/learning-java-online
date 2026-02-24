import java.util.Scanner;

public class swapnumber {
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your first number");
        int a = sc.nextInt();
        System.out.print("Enter your  Second number");
        int b = sc.nextInt();
        System.out.println("Before swapping "+a+" "+b);
        // int c = a;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping "+ a+" "+ b);
    }
}
