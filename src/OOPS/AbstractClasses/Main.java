package OOPS.AbstractClasses;

public class Main {
    //we can't create objects of an abstract class
    //we can't create abstract static methods because abstract has to be overridden but static methods can't be overridden because static methods doesn't depend on objects
    //abstract classes can't be final because they should be overridden
    public static void main(String[] args) {
        Son son=new Son(19);
        son.career();
        Daughter daughter=new Daughter(18);
        daughter.career();
        Parent.hello();
    }
}
