public class BasicOops {
// Attribute
   public int id;
   private int age;
   private String name;
   public int nos;
   private String gf;

   public String getName(){
      return this.name;
   }
   public String getGf(){
      return this.gf;
   }
   public int getAge(){
      return this.age;
   }
   public void setAge(int a){
       this.age = a;
   }



// Default ctor
   public BasicOops(){
      System.out.println("Default ctor called");
   } 
   
// parameterised ctor
public BasicOops(int id,int age, String name, int nos, String gf){
      System.out.println("parameterised ctor called");
      this.id =id;
      this.age = age;
      this.name = name;
      this.nos = nos;
      this.gf = gf;
   }

 //  Method /Behavior
 public void study(){
    System.out.println(name +" Studing");
 }

 public void sleep(){
    System.out.println(name +" Sleeping");
 }

 public void bunk(){
    System.out.println(name +" Bunking");
 }

 private void gfchatting(){
   System.out.println(name +" gf chatting");
 }

 
 public static void main(String [] args){
    // Default ctor
    // BasicOops A = new BasicOops();
    // A.id = 1;
    // A.age = 18;
    // A.name = "vishal";
    // A.nos = 5;

    // System.out.println(A.name);
    // System.out.println(A.age);
    // System.out.println(A.id);
    // System.out.println(A.nos);
   
    // A.study();
    // A.sleep();
    // A.bunk();

    // parametermised ctor
    BasicOops a = new BasicOops(1,19,"vishal",06, "priya");
   //   System.out.println(a.name);
   //   System.out.println(a.age);
   //   System.out.println(a.id);
   //   System.out.println(a.nos);
     System.out.println(a.getName());
     System.out.println(a.getGf());
     System.out.println(a.getAge());
   
     a.setAge(21);
     System.out.println(a.getAge());
   //  a.study();
   //  a.sleep();
   //  a.bunk();

 }
    
}