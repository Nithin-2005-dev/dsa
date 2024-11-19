package Functions.Theory;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
    fun(1,2);
    multiple(2,3,"nithin","kumar","jaan");
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a,int b,String ...s){
        System.out.println(b);
        System.out.println(Arrays.toString(s));
    }
}
