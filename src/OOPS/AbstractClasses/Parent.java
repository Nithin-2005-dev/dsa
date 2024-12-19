package OOPS.AbstractClasses;

public abstract class Parent {
    public Parent(int age){
        this.age=age;
    }
    static void hello(){
        System.out.println("Hello");
    }
    int age;
    abstract void career();
    abstract void partner();
}
