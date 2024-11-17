package ConditionsAndLoops.problems;

import java.util.Scanner;

public class FibnacciNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        int num1=0;
        int num2=1;
        for (int i = 0; i < n; i++) {
            System.out.println(num1);
            int temp=num1;
            num1=num2;
            num2=num2+temp;
        }
    }
}
