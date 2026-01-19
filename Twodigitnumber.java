//take integer input and check it is 2 digit number
import java.util.Scanner;
class Twodigitnumber{
      public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number :");
      int n = sc.nextInt();
          if(n>9 && n<100){
          System.out.println("Two digit number");  
          }else{
          System.out.println("Not Two digit number");

}
         

 }



}