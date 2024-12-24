package Strings.PatternProblems;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for (int i = 0; i < n; i++) {

            if(i<=n/2){
                for (int j = i+1; j<n; j++) {
                    System.out.print(" ");
                }
                for (int j = i; j >=0 ; j--) {
                    System.out.print("* ");
                }
            }else{
                for (int j = 1; j<=i; j++) {
                    System.out.print(" ");
                }
                for (int j = n; j >i; j--) {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }
}
