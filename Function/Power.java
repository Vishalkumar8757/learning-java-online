import java.util.Scanner;
class Power{
public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter first number :");
      int a = sc.nextInt();

      System.out.print("Enter second number :");
      int b = sc.nextInt();

      int pow = 1;
      for(int i=1; i<=b; i++){
       pow*=a;
      }
       System.out.println(pow);
  }
}