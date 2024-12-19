package OOPS.Principles.Polymorphism;

public class Circle extends Shapes{
    //this will run when object of circle is created
    //hence it is overriding the parent method
    @Override //this is called annotation
    void area(){
        System.out.println("area is pi*r*r");
    }
}
