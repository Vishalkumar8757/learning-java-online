//Take 3 positive number and print the largest of them
import java.util.Scanner;
class Printlargestnumber{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
       System.out.println("Enter a first number");
       int p = sc.nextInt();
       System.out.println("Enter a second number");
       int q = sc.nextInt();
       System.out.println("Enter a third number");
       int r = sc.nextInt();
          if(p>q && p>r){
          System.out.println(p+" is largest number");
          }
          else if(q>p && q>r){
          System.out.println(q+" is largest number");
          }
          else{
          System.out.println(r+" is largest number");
}


}
}
