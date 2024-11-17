package FundamentalsOfJava.Problems;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter temperature in celsius:");
        int tempC=input.nextInt();
        float tempF=tempC*((float)9.0/5)+32;
        System.out.println("temperature in fahrenheit:"+tempF);
    }
}
