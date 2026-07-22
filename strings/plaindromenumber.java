import java.util.Scanner;

public class plaindromenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number :");
        int n = sc.nextInt();
        int reverse = 0;
        int m = n;
        while (n!=0) {
            int lastdigit = n%10;
            reverse = reverse*10+lastdigit;
            n = n/10;
        }
        if(m==reverse) System.out.println("plaindrome number");
        else System.out.println(" Not plaindrome number");
    }
}
