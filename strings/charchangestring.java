public class charchangestring {

    public static void main(String[] args) {
        String s = "vishal";
        s = s.substring(0,3)+'m'+s.substring(4);
                    // 0 to 2 index tak + m + lasttak jane ke liye uske baad ka index (4)
        System.out.println(s);
    }
}