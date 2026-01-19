//print all factorial number


import java.util.Scanner;
class  Allfactorial {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number :");
         long n = sc.nextLong();
              int  factorial = 1;
          for(int i=1; i<=n; i++){
             factorial=factorial*i ;
             System.out.println(factorial);
          }
          
    }
}