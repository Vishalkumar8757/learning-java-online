public class Car extends Vechile{

  public int noOfdoor;
  public String transmissionTyre;

  public Car(String name, String model, int noOftyres, int noOfdoor, String transmissionTyre ){
    
     super(name,model,noOftyres);
     this.noOfdoor = noOfdoor;
     this.transmissionTyre = transmissionTyre;
  }

  public void startAc(){
    System.out.println("AC started of "+ name);
  }

}