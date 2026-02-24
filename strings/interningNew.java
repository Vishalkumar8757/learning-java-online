public class interningNew{
    public static void main(String[]args){
        // String s1 = "Vishal";
        // String s2 = "Vishal";
        // System.out.println(s1==s2); //true

        String s1 = new String("Vishal") ;
        String s2 =  new String("Vishal") ;

        System.out.println(s1==s2); // false
        System.out.println(s1.equals(s2));  // true
        // System.out.println(equals(s1, s2));  // true

        //internally work kise ho raha h 
    }
    public static  boolean equals(String s1, String s2) {
        if (s1.length()!=s2.length()) {
            return false;
        }
        for(int i=0; i<s1.length(); i++){
            if (s1.charAt(i)!= s2.charAt(i)) {
                return  false; 
            }
        }
        return true;
    }
}