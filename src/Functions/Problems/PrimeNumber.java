package Functions.Problems;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for (int i = 0; i <=n ; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    static Boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int i=2;
        while(i*i<=n){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
