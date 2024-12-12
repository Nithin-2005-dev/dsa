package MathsForDSA.Problems;

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(lcm(3,6));
    }
    static int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}
