package MathsForDSA.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.sort;

public class factors {
    public static void main(String[] args) {
        System.out.println(getFactors2(40));
    }
    static List<Integer> getFactors(int n){
        List<Integer> list=new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            if(n%i==0){
                list.add(i);
            }
        }
        return list;
    }
    static List<Integer> getFactors2(int n){
        List<Integer> list=new ArrayList<>();
        for (int i = 1; i <=Math.sqrt(n); i++) {
            if(n%i==0){
                list.add(i);
                list.add(n/i);
            }
        }
        return list;
    }
}
