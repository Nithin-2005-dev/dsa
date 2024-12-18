package OOPS.Introduction.Static;
//this is a demo to show initialisation of static variables
public class StaticBlock {
    static int a=10;
    static int b;
    //will only run once,when the first obj is created i.e when the class is loaded for the first time
    static {
        System.out.println("i'm in static block");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj=new StaticBlock();
        System.out.println(StaticBlock.a +" "+StaticBlock.b);
        StaticBlock.b+=3;
        //it doesn't call the static block again
        StaticBlock obj2=new StaticBlock();
        System.out.println(StaticBlock.a +" "+StaticBlock.b);

    }
}
