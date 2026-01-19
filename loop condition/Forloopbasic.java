//Print hello world 'n' times take 'n' as input from user
  import java.util.Scanner;
  class Forloopbasic{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter n : ");
      int n = sc.nextInt();
      
      for(int i=1; i<=n; i=i+1){
         System.out.println("Hello world");
      }
  
}
  
  
}