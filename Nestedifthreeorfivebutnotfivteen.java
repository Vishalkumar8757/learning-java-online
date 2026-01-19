// take positive integer input and tell if it is divisible by 5 or 3 but not divisible by 15
   

   import java.util.Scanner;
   class Nestedifthreeorfivebutnotfivteen{
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number : ");
   int n = sc.nextInt();
     
        if(n%5==0 || n%3==0){
           
          if(n%15!=0){
             System.out.println("the no is divisible by 5 or 3 bt not 15");
            }
            else{
             System.out.println("not divisible");
            }
       
       }
       else{
             System.out.println("not divisible");
          }


     }

}

    