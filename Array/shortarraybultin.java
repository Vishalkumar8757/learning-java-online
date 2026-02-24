import java.util.Arrays;

public class shortarraybultin {
    public static void main(String[] args) {
        int[] arr = {52,482,-1,52,-5,261,525,04,225};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr) {
        for(int i=0; i<arr.length; i++){
           System.out.print(arr[i]+" "); 
        }
        System.out.println();
    }
    
}
