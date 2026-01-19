import java.util.Scanner;
class  Function1{
public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter first number :");
      int a = sc.nextInt();

      System.out.print("Enter second number :");
      int b = sc.nextInt();

      System.out.print("Enter third number :");
      int c = sc.nextInt();
    
      System.out.print("Enter forth number :");
      int d = sc.nextInt();


     System.out.println(Math.min(a,Math.min(b,Math.min(c,d))));
  }
}