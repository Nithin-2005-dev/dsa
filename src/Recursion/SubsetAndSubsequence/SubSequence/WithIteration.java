package Recursion.SubsetAndSubsequence.SubSequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WithIteration {
    public static void main(String[] args) {
    int[] arr={1,2,2};
        System.out.println(subsetDup(arr));
    }
    //time complexity =O(n*2^n)
    //when you find a duplicate element only add it in a newly created subset in previous step
    //because of this above point duplicates has to be together
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num:arr){
            int size=outer.size();
            for (int i = 0; i < size; i++) {
                List<Integer> inner=new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
    static List<List<Integer>> subsetDup(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int s=0;
        int e=0;
        for (int i=0;i<arr.length;i++){
            s=0;
            if(i>0 && arr[i]==arr[i-1]){
                s=e+1;
            }
            e=outer.size()-1;
            int size=outer.size();
            for (int j = s; j < size; j++) {
                List<Integer> inner=new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
