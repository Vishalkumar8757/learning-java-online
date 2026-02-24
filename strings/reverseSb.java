public class reverseSb {
    public static void main(String[] args) {
        String s ="vishal";
        StringBuilder str = new StringBuilder(s);

        char[] arr = s.toCharArray(); // string ko phele char array me change karna hoga fir swap kar sakte h
        int i = 0;
        int j = arr.length-1;

        while (i<j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(arr);


        // str.reverse();
        // System.out.println(str);

        // int i = 0 ;
        // int j = str.length()-1 ;
        // while (i<=j) {
        //     char temp1 = str.charAt(i);
        //     char temp2 = str.charAt(j);
        //     str.setCharAt(i, temp2); 
        //     str.setCharAt(j, temp1); 
        //     i++;
        //     j--;

        // }
        // System.out.println(str);


    }
}
