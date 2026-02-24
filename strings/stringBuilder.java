public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("vishal");
         System.out.println(str.length()+" "+str.capacity());
         // khali stringbuilder ki capacity 16 hoti h
        System.out.println(str);
        str.append(" kumar");
         System.out.println(str);
         str.setCharAt(0, 'B');
         System.out.println(str);

         // string builder to string jo ki string builder jaise hoti h 
         String t = str.toString();
         System.out.println(t);
    }   
}
