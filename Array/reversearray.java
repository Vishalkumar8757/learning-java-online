public class reversearray {
    public static void main(String[] args) {
        int[] arr = {5,39,4,29,72,9,2,6,8,622} ;
        int n = arr.length;
        int i = 0 ;
        int j = n-1 ;
        while (i<j) {
           int temp = arr[i];
           arr[i] = arr[j];           
           arr[j] = temp;  
           i++;
           j--;         
        }
        for(int element : arr){
            System.out.print(element+" ");
        }
    }
}
