package MathsForDSA.Problems;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if((n &1)==0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}
