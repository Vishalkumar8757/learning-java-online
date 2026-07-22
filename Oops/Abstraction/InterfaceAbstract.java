interface Birds {
    void fly();
    void eat();
}

class Sparrow implements Birds {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow is eating");
    }
}

class Crow implements Birds {
    @Override
    public void fly() {
        System.out.println("Crow is flying");
    }

    @Override
    public void eat() {
        System.out.println("Crow is eating");
    }
}

public class InterfaceAbstract {

    public static void doBirdStuff(Birds b) {
        b.eat();
        b.fly();
    }

    public static void main(String[] args) {
        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());
    }
}