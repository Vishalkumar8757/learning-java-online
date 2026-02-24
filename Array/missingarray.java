public class missingarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,4};
        int n = arr.length+1;
        int sum = n*(n+1)/2;
        int arraySum  = 0 ;
        for(int ele : arr){
            arraySum += ele;
        }
        int element = sum - arraySum ;
        System.out.print(element) ;
    }
}
