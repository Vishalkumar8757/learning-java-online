import java.util.Scanner;

public class permutation {
    public static int fact(int x){
        int xfact = 1;
        for(int i=1; i<=x; i++){
           xfact*=i;
        }
        return xfact;
    }
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number");
        int n = sc.nextInt();

        System.out.print("Enter your second number");
        int r = sc.nextInt();

        int nfact = fact(n);
        int n_rfact = fact(n-r);
         
        int npr = nfact/n_rfact;
       // int npr = fact(n)/fact(n-r);
        System.out.println(npr);
    }
}
