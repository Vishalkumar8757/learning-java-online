//display the gp 1,2,4,8,16,32,64..... upto 'n' term
import java.util.Scanner;
public class Gp{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number : ");
int n = sc.nextInt();
int a=1, r=2;
for(int i=1; i<=n; i++){
System.out.println(a+" ");
   a*=r;
   }
 }
 
}
