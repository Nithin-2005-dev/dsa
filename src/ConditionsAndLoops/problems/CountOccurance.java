package ConditionsAndLoops.problems;

import java.util.Scanner;

public class CountOccurance {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        int num=input.nextInt();
        int count=0;
        while (number>0){
            if(number%10==num){
                count++;
            }
            number/=10;
        }
        System.out.println(count);
    }
}
