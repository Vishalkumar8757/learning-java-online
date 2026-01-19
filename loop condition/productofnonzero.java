// product of non zero

import java.util.Scanner;
class  Productofnonzero {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number :");
         int n = sc.nextInt();
         int product = 1;
          while(n!=0){
            int lastdigit = n%10;
            if(lastdigit==0){
                lastdigit= lastdigit+1;
            }
            product = product*lastdigit;
            n=n/10;
          }
          System.out.println(product);
    }
}