package MathsForDSA.Problems;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        boolean[] primes=new boolean[n+1];
        sieve(n,primes);
    }
    static void sieve(int n,boolean[] primes){
        for (int i = 2; i*i<=n ; i++) {
            if(!primes[i]){
                for (int j = i*2; j <=n ; j+=i) {
                    primes[j]=true;
                }
            }
        }
        for (int i = 2; i <=n; i++) {
            if(!primes[i]){
                System.out.println(i+" ");
            }
        }
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for (int i = 2; i <=(int)Math.sqrt(n); i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
