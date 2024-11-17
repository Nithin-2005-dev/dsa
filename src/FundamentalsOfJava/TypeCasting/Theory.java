package FundamentalsOfJava.TypeCasting;

import java.util.Scanner;

public class Theory {
    public static void main(String[] args) {
        //auto casting:-it will occur when small size datatype assigns in large size datatype
        Scanner input=new Scanner(System.in);
        float num=input.nextInt();
        System.out.println(num);
        //type casting
        int num1=(int) input.nextFloat();
        System.out.println(num1);
    }
}
