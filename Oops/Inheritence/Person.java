public class Person {
   public String name;

    public Person(){
        System.out.println("Default ctor is called");
    }
    public Person(String name){
        System.out.println("parameterised ctor is called");
        this.name = name;
    }
}
