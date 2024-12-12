package MathsForDSA.Problems;

import java.util.Scanner;

public class IthBit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int I= input.nextInt();
        System.out.println(n&(1<<(I-1)));
    }
}
