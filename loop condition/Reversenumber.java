import java.util.Scanner;
class Reversenumber {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number :");
         int n = sc.nextInt();
         int reverse = 0;
         while(n!=0){
             int lastdigit = n%10;
             reverse = reverse*10;
             reverse = reverse+lastdigit;
             n=n/10;
         }
         System.out.println(reverse);
    }
}