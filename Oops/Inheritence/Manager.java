public class Manager extends Employee {
    public String dept;
    public Manager(String name ,int sal ,String dept){
        super(name, sal);
        this.dept = dept;
    }
}
