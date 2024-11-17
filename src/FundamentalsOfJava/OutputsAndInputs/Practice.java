package FundamentalsOfJava.OutputsAndInputs;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String name=input.next();
        System.out.println("hello "+name);
        //input integer
        int age=input.nextInt();
        System.out.println("age="+age);
    }
}
