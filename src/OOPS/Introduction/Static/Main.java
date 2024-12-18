package OOPS.Introduction.Static;

public class Main {
    public static void main(String[] args) {
        Human nithin=new Human(19,"nithin",10000,false);
        Human janu=new Human(19,"janu",20000,false);
        //static variables doesn't need any object
        System.out.println(Human.population);
//        greet();
        fun();
    }
    //this is not dependent on object
    static void fun(){
        //this is dependent on objects
//        greet(); you can't use it because it requires an instance
        //but the function you are using it in does not depend on instance

        //you cannot access non-static stuff without referencing their instances in a static context
        //hence,here we are referencing it
        Main obj=new Main();
        obj.greet();
    }
    //we know that something which is not static belongs to an object
    void greet(){
        System.out.println("hello");
    }
}
