//else if condition
import java.util.Scanner;
class Percentageelseif{
      public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter percentage : ");
      int p = sc.nextInt();
      if(p>90){
        System.out.println("Excettent");
        }else if(p>80){
        System.out.println("very goodt");
        }else if(p>70){
        System.out.println("good");
        }else if(p>60){
        System.out.println("can be better");
        }else if(p>50){
        System.out.println("average mark");
        }else if(p>40){
        System.out.println("below average");
      }else{
        System.out.println("fail");

  }
  
  

}

}