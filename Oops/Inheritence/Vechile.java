public class Vechile {

    public String name;
    public String model;
    public int noOftyres;

    public Vechile(){
        System.out.println("Default ctor called");
    }

    Vechile(String name, String model, int noOftyres){
         System.out.println("parameterised ctor called");
         this.name = name;
         this.model = model;
         this.noOftyres = noOftyres;
    }

    void startEngine(){
        System.out.println("Engine is starting"+" "+ name +" "+ model);
    }
    void stopEngine(){
        System.out.println("Engine is Stop");
    }
}