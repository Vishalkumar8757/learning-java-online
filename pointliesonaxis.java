// given a point (x,y) WAP to find out if it lies on the x-axis ,y-axis or at a origin
  
   import java.util.Scanner;
   class pointliesonaxis{
   public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
          int x = sc.nextInt();
            System.out.println("Enter a number");
          int y = sc.nextInt();
           if (x==0 && y==0){
             System.out.println("point lies on origin");
          }
           else if (x==0){
             System.out.println("point lies on y-axis");
          }
           else if (y==0){
            System.out.println("point lies on x-axis");
          }
           else{
            System.out.println("invalid point");
          }
  }
}