package Functions.Theory;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Theory {
    public static void main(String[] args) {
        //Q: take input of 2 numbers and print sum
        System.out.println(sum3(3,4));
    }
    /*
    access_modifier return_type name(arguments){
    body
    return statement;
    }
     */
    public static void sum(){
        Scanner input=new Scanner(System.in);
        int a= input.nextInt();
        int b=input.nextInt();
        System.out.println(a+b);
    }
    // return value
    public static int sum2(){
        Scanner input=new Scanner(System.in);
        int a= input.nextInt();
        int b=input.nextInt();
        return (a+b);
    }
    //pas the value of numbers when you are calling the method in main()
    static int sum3(int a,int b){
        return a+b;
    }
}
