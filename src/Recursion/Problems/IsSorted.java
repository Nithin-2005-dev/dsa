package Recursion.Problems;

import arrays.Input.InputAnIntArray;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr= InputAnIntArray.ArrayInput();
        System.out.println(checkSorted(arr,0));
    }
    static boolean checkSorted(int[] arr,int i){
        if(i>=arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }else{
            return checkSorted(arr,i+1);
        }
    }
}
