package OOPS.Principles.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box=new Box(4);
//        System.out.println(box.l+" "+box.w+" "+box.h);
        BoxWeight box2=new BoxWeight();
//        System.out.println(box2.l+" "+box2.w+" "+box2.h+" "+box2.weight);
        //you can't access child class variables with this
        Box box3=new BoxWeight(2,3,4,8);
        //there are any variables in both parent and child
        //you are given access to variables that are in the ref type i.e BoxWeight
        //hence,you should have access to weight variable
        //this also means,that the ones you are trying to access should be initialised
        //but here,when the object itself is of type parent class,how will you call the constructor of child class
        //that is why it is not allowed
//        BoxWeight box4=new Box();
    }
}
