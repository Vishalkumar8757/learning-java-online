//WAP to print sum of all the even digit of a given number

import java.util.Scanner;
class Sumofevendigits{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

       System.out.println("Enter number : ");
       int n = sc.nextInt();
       int sum = 0;
       
       while(n!=0){
         int lastdigit = n%10;
         if(lastdigit%2==0){
         sum+=lastdigit;
        } 
         n/=10;
       }
       System.out.println(sum);
       
    }
}