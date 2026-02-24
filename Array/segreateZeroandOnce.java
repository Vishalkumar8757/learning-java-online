public class segreateZeroandOnce {
    public static void main(String[] args) {
        int[] arr = {0,1,0,0,1,1,1,0,0,0,1};
        int n = arr.length;
        int zero = 0;
        // int once = 0;
        for( int ele : arr ){
            if (ele == 0) {
            zero++;  
            }
        //   else{
        //       once++ ;
        //    } 
        }
         

        for(int i=0; i<zero; i++ ){
            arr[i] = 0;
        }
        for(int i=zero; i<n; i++ ){
            arr[i] = 1;
        }

        for(int i=0; i<n; i++){
             System.out.print(arr[i]+" ");
        }
    }
}
