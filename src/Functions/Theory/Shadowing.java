package Functions.Theory;

    public class Shadowing {
    static int x=90; //this will be shadowing at line 10
    public static void main(String[] args) {
        System.out.println(x); //x=90
        fun(); //x=50
    }
    static void fun(){
        int x; //the class variable at line 4 is shadowed by this
        //x can't be used here
        x=50;
        System.out.println(x);
    }
}
