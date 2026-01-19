// print the givien pattern
//1
//13
//135
//1357

import java.util.Scanner;
 public class Oddnumbertriangle{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter rows & column : ");
 int n = sc.nextInt();


    for(int i=1; i<=n; i++){
       for(int j=1; j<=i; j++){
          System.out.print(2*j-1);
        }
          System.out.println();
    }
  
  }
}