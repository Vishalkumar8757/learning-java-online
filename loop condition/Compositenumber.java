// lets check if any number composite or not
import java.util.Scanner;
public class Compositenumber{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Entera number : ");
int n = sc.nextInt();
   for(int i=2; i<=n; i++){
     if(n%i==0){
       System.out.println("composite number");
         break;
      }
  

   }
  }
 }