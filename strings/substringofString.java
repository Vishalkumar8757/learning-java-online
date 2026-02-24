public class substringofString {
    public static void main(String[] args) {
        // String str = "jaishankar";
        // System.out.println(str.substring(2,6)); //2to5

        String str = "vishal";

        for (int i=0; i<str.length(); i++) {
            for (int j=i+1; j<=str.length(); j++) {
                System.out.print(str.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
} 
