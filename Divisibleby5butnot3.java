// check number id divisible by 5 but not 3
import java.util.Scanner;
class Divisibleby5butnot3{ 
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number : ");
   int n = sc.nextInt();
   if(n%5==0 && n%3!=0){
   System.out.println("number is divisible ");
   }else{
   System.out.println("number is not divisible");

}



}



}