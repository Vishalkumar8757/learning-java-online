import java.util.Scanner;

public class palindromeString {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your paildrome word");
    String str = sc.nextLine();
    int i = 0;
    int j = str.length()-1;

    boolean paildrome = true;
    while (i<=j) {
        if (str.charAt(i)!=str.charAt(j)) {
          paildrome = false;
          break;  
        }
        i++;
        j--; 
    }
    if (paildrome) {
        System.out.println("paildrome");
    }
    else{
       System.out.println(" Not paildrome");  
    }
    
   } 
}
