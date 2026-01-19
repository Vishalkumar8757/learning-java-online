//WAP to find if a number ids divisible by both 3 and 5
   

   import java.util.Scanner;
   class nestedthreeandfive{
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(n%5==0){
          if(n%3==0){
               System.out.println("The number is divisible by both");
            }
            else{
                System.out.println("not divisible");
            }

         }
         else{
           System.out.println("Not divisible ");
       }
    }
}