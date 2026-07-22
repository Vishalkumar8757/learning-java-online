public class Main {
    public static void main(String[] args) {
        // MethodOveroading m = new MethodOveroading();
        // System.out.println(m.add(25, 5));
        // System.out.println(m.add(5,8,6));
        // System.out.println(m.add(5,8,6,8.6));

        // runtime polymorphism
        Circle c = new Circle();
        //c.draw();
        drawnigstuff(c);

        Rectangle r = new Rectangle();
       // r.draw();
       drawnigstuff(r);

        Shape s = new Shape();
        //s.draw();     
        drawnigstuff(s);
    }
    //Dynamic method dispatch(upcasting) 
    public static void drawnigstuff(Shape s){
         s.draw();
    }
}
