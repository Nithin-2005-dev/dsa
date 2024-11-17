package ConditionsAndLoops.Loops;

import java.util.Scanner;

public class Theory {
    public static void main(String[] args) {
        //Q:print numbers from 1 to n
        /*
        syntax of for loop:
        for(initialisation;condition;increment/decrement){
        body
        }
         */
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println("with for loop:");
        for (int i = 1; i <=n ; i++) {
            System.out.print(i+"  ");
        }
        //while loop
        /*
        Syntax:
        initialisation
        while(condition){
        body
        increment/decrement
        }
         */
        System.out.println();
        System.out.println("with while loop:");
        int i=1;
        while (i<=n){
            System.out.print(i+"  ");
            i++;
        }
        /*
        use for loop if you know number of iterations
        else use while loop
         */
        //do while
        /*
        do{
        body
        increment/decrement
        }while(condition)
         */
        System.out.println();
        System.out.println("with do-while loop");
        do{
            System.out.print(i+"  ");
            i++;
        }while(i<n);
    }
}
