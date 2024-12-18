package OOPS.Introduction.Static;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
//    long population; //it is different for different objects
    static long population; //it will be common to all objects of a class
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        population+=1;
    }
}
