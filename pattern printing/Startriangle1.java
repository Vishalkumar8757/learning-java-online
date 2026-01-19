import java.util.Scanner;
 public class Startriangle1{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter rows & column : ");
 int n = sc.nextInt();


    for(int i=1; i<=n; i++){     //row
       for(int j=1; j<=i; j++){  //column
          System.out.print(j+" ");
        }
          System.out.println();
    }
  
  }
}