public class PassingArgument {
    public static void greet(String name){
        System.out.println("good morning "+name);
    }
    public static void intro(String name ,int age ,int b ,char grade ){
        System.out.println("Hello "+name+" your age is "+age+" you study in class"+b+ " And your grade is "+grade);
    }
    public static void main(String args[]){
         greet("vishal ");
         sum(55,8);
        //  intro("vishal" ,20);
         intro("roshani" ,21 , 10 ,'A');
    }
    public static void sum(int a, int b){
        System.out.println("sum is "+(a+b));
    }
}
