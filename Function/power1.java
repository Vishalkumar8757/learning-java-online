import java.util.Scanner;

public class power1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number");
        double a = sc.nextInt();
        System.out.print("Enter your second number");
        double b = sc.nextInt();
         System.out.print("Enter your third number");
        double c = sc.nextInt();
          System.out.print("Enter your third number");
        double d = sc.nextInt();

        // System.out.println(Math.pow(5, 3));
        // System.out.println(Math.sqrt(5));
        // System.out.println(Math.cbrt(8));
        // System.out.println(Math.max(a,Math.max(b, c)));
        System.out.println(Math.max(a, Math.max(b, Math.max(c, d))));
        System.out.println(Math.min(a, Math.min(b, Math.min(c, d))));
    }
}
