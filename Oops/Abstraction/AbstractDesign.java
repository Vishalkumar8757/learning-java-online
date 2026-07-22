abstract class Bird{
    abstract void fly();
    abstract void eat();

    // public void sleep(){
    //     System.out.println("Bird is sleeping");
    // }
}
class Sparrow extends Bird{
    void fly(){
        System.out.println("Sparrow is flaying");
    }

    void eat(){
        System.out.println("Sparrow is eating");
    }
} 
class Crow extends Bird{
    void fly(){
        System.out.println("Crow is flaying");
    }

    void eat(){
        System.out.println("Crow is eating");
    }
} 
public class AbstractDesign {
   public static void main(String[] args) {
      Bird b = new Sparrow() ;
          b.eat();
          b.fly(); 
        //   b.sleep(); 

          b = new Crow() ;
          b.eat();
          b.fly();     
   }
    
}