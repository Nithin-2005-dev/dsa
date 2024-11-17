package ConditionsAndLoops.problems;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int reverse=0;
        while (num>0){
            reverse=reverse*10+num%10;
            num/=10;
        }
        System.out.println(reverse);
    }
}
