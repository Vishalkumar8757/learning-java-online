// check the number prime or not
import java.util.Scanner;
public class primenumber{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number : ");
int n = sc.nextInt();
Boolean flag = false;
      for(int i=2; i<n;i++){
          if(n%i==0){
             flag = true;
             break;
            }
      }
      if(n==1)
        System.out.println("neither prime nor composite")
      elseif(flag==false)
        System.out.println("prime number");
      else
        System.out.println("composite number");

  }      
}