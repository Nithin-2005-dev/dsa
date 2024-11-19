package Functions.Theory;

public class FunctionOverLoading {
    //function overloading happens at run time
    public static void main(String[] args) {
        sum(1,2);
        sum(1,2,3);
    }
    static void sum(int a,int b){
        System.out.println(a+b);
    }
    static void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
