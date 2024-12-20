package OOPS.Cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human nithin=new Human(19,"nithin");
        Human twin=(Human)nithin.clone();
        System.out.println(twin.age);
    }
}
