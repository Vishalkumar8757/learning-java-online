public class Twosum {
    public static void main(String[] args) {
        int[] arr = {2,5,3,8,1,6,};
        int target  = 13;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if (arr[i]+arr[j]==target) {
                    System.out.println("True"); 
                    return; 
                } 
            }
        }
         System.out.println("false");
    }
}
