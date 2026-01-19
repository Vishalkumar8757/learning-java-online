//if the age of ram,shyam and ajay are the input through the keyboard WAP to determine the youngest of these three
   

import java.util.Scanner;
class Youngestage{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a age : ");
int r = sc.nextInt();
System.out.println("Enter a age : ");
int s = sc.nextInt();
System.out.println("Enter a age : ");
int a = sc.nextInt();
System.out.println("Enter a age : ");
     if(r>s && r>a){
     System.out.println("ram is youngest");
     }else if(s>r && s>a){
     System.out.println("shyam is youngest");
     }
     else{
     System.out.println("ajay is youngest");
 
}
  



}


}