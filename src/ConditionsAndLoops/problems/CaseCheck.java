package ConditionsAndLoops.problems;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.next().charAt(0);
        if(num>=65 && num<=90){
            System.out.println("capital letter");
        } else if (num>=97 && num<=122) {
            System.out.println("small letter");
        }else {
            System.out.println("special character");
        }

    }
}
