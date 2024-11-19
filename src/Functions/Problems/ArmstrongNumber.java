package Functions.Problems;

import java.util.ArrayList;

public class ArmstrongNumber {
    public static void main(String[] args) {
        for (int i = 100; i < 999; i++) {
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
    static Boolean isArmstrong(int n){
        ArrayList<Integer> digits=new ArrayList<Integer>();
        int a=n;
        while (n>0){
            digits.add(n%10);
            n/=10;
        }
        int sum=0;
        for (int i = 0; i < digits.size(); i++) {
            sum+= (int) Math.pow(digits.get(i),3);
        }
        return sum == a;
    }
}
