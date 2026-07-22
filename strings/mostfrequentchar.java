import java.util.Arrays;

public class mostfrequentchar {
    public static void main(String[] args) {
        String s = "success";
        int n = s.length();
        int maxFre = -1;
        char ans = s.charAt(0);

        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        int i = 0 , j= 0;
        while (j<n) {
            if (arr[i] == arr[j]) {
                j++;
            }
            else{
                int freq = j-i;
                if(freq>maxFre){
                    maxFre = freq;
                    ans= arr[i];
                }
                i=j;
            }
        }
        int freq = j-i;
        if(freq>maxFre){
            maxFre = freq;
            ans= arr[i];
        }
         System.out.println(ans);
    }
}
