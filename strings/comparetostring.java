public class comparetostring {
    public static void main(String[] args) {
        String s = "harsh";
        String ss = "harshita";
        System.out.println(s.compareTo(ss));
        System.out.println(s.concat(ss));

        s = s +"Harshi";
        s = s + s; 
        s = 10 + s; 
        s += 10;

        System.out.println(s);
        System.out.println("singh"+10+20);
        System.out.println(10+20+"vishal");   // string + integer = string 
        System.out.println(10+"vishal"+20);
        System.out.println(10+"vishal"+20+"kumar");
        System.out.println('A'+2+"vishal"); //char+ integer = integer
    }
}
