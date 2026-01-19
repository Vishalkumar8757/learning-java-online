// profit loss question
import java.util.Scanner;
class Profitloss{ 
public static void main(String args[]){ 
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a cost price : ");
       int cp = sc.nextInt();
       System.out.println("Enter a selling price : ");
       int sp = sc.nextInt();
       if(sp>cp){
        System.out.print(" your profit is : ");
        System.out.println(sp-cp);
      }else{
        System.out.print("your loss is : ");
        System.out.println(cp-sp);


 }
 


   }

}