// display the ap 4,7,10,13,16... upto 'n' terms
// display the  ap 1,3,5,7,9.....upto "n" term
import java.util.Scanner;
public class Ap1{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number : ");
int n = sc.nextInt();
//for(int i=4; i<=3*n+1;i+=3){
  //System.out.println(i);
    //}
 
   //}
//}


  int a=4, d=3;
 for(int i=1; i<=n; i++){
 System.out.println(a+" ");
   a +=d;
   }
}
}