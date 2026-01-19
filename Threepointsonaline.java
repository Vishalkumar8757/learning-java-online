//given three points (x1,y1),(x2,y2),(x3,y3) WAP to check if all the three point fall on a straight line
 

import java.util.Scanner;
class Threepointsonaline{
public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double x1=1, x2=2, x3=3, y1=1, y2=2, y3=3;
        double m1= (y2-y1)/(x2-x1);
        double m2= (y3-y2)/(x3-x2);
        if(m1==m2){
         System.out.println("The point fall on straight line");
        }
        else{
         System.out.println("The point do not fall on straight line");
        }

     }
}