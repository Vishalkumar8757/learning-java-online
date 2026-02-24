public class rotatearray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int d = 2; 

        rotateleft(arr , d);
        print(arr);
    }

    public static void rotateleft(int[] arr ,int d){
        int n = arr.length;
        d = d%n;

        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }

    public static void  reverse(int[] arr, int i, int j){
        while (i<j) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
          i++;
          j--;
        }
    }

    public static void  print(int[] arr) {
        for(int ele :arr){
            System.out.print(ele+" ");
        }
    }
}
