package Functions.Theory;

public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        //block scope
        {
//            int a=10; already initialised outside the block in the same method,hence you cannot initialise it again
            a=100;// but you can change
            int c=100;
            System.out.println(a); //a can be accessible because this block is into the scope of a
        }
//        System.out.println(c); -->c is accessible in above block only
    }
    static void random(){
//        System.out.println(a); it is not possible because a is not in the scope of this function
    }
}
