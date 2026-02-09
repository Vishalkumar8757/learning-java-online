import java.util.Scanner;
class  Function1{
public static void main(String args[]){
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter first number :");
      int a = s.nextInt();

      System.out.print("Enter second number :");
      int b = s.nextInt();

      System.out.print("Enter third number :");
      int c = s.nextInt();
    
      System.out.print("Enter forth number :");
      int d = s.nextInt();


     System.out.println(Math.min(a,Math.min(b,Math.min(c,d))));
  }
}