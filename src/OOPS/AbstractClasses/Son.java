package OOPS.AbstractClasses;

public class Son extends Parent{
    //child class should override the methods of abstract parent class
    public Son(int age){
        super(age);
    }
    @Override
    void career() {
        System.out.println("i'm going to be a doctor");
    }
    @Override
    void partner(){
        System.out.println("I love she is pepper potts");
    }
}
