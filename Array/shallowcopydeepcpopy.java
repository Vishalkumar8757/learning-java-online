import java.util.Arrays;

public class shallowcopydeepcpopy {
    public static void main(String[] args) {
        int[] arr = {26,63,94,6325,255,526,522};
        // int[] x = arr;
        // x[0] = 100 ;
        // System.out.println(x[0]);
        int[] y = Arrays.copyOf(arr, arr.length);  // deep copy
        y[0] = 100;
        System.out.println(y[0]);
        System.out.println(arr[0]);
    }
}
