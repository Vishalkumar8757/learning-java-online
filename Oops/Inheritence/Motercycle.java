public class Motercycle extends Vechile {
   public String handelbar;
   public String suspension;

   public Motercycle(){
    System.out.println("Default ctor called");
   }
   public Motercycle(String name ,String model, int noOftyres,String handlebar ,String suspension){
    
    super(name,model,noOftyres);
    this.handelbar = handlebar;
    this.suspension = suspension;
   }

   public void wheelie(){
      System.out.println("motercycle is doing wheelie " + name);
   }
}
