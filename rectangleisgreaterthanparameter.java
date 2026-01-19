//area of rectangle is greater than parameter
import java.util.Scanner;
class rectangleisgreaterthanparameter{
      public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter length : ");
      int l = sc.nextInt();
      System.out.println("Enter breath : ");
      int b = sc.nextInt();
      int area = l*b;
      int paremeter = 2*(l+b);
         if(area>paremeter){
            System.out.println("Area is greater than paremeter : ");
         }else{
            System.out.println("paremeter is greater than area : ");

  }



 }

}