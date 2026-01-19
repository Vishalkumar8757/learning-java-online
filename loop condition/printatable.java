// print the table of n here n is a integer which user will input
import java.util.Scanner;
public class printatable{
public static void main(String args[]){
Scanner sc =   new Scanner(System.in);
System.out.println("Enter anumber : ");
 int n = sc.nextInt();
   for(int i=1; i<=10; i++){
     
     System.out.println(n*i);
   }

   }
}