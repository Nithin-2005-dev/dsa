package Sorting;

import arrays.Input.InputAnIntArray;

import java.util.Arrays;

public class MergeSort {
    /*
    1)divide array into two parts
    2)get both parts sorted via recursion
    3)merge two sorted parts
     */
    public static void main(String[] args) {
        int[] arr= InputAnIntArray.ArrayInput();
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] first=Arrays.copyOfRange(arr,0,mid);
        int[] second=Arrays.copyOfRange(arr,mid,arr.length);
        int[] firstSort=sort(first);
        int[] secondSort=sort(second);
        return mergeTwo(firstSort,secondSort);
    }

    static int[] mergeTwo(int[] firstSort, int[] secondSort) {
        int[] merged=new int[firstSort.length+secondSort.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<firstSort.length && j<secondSort.length){
            if(firstSort[i]<secondSort[j]){
                merged[k]=firstSort[i];
                i++;
            }else {
                merged[k]=secondSort[j];
                j++;
            }
            k++;
        }
        if(i==firstSort.length){
            while (k<merged.length){
              merged[k]=secondSort[j];
              k++;
              j++;
            }
        }else{
            while (k<merged.length){
                merged[k]=firstSort[i];
                k++;
                i++;
            }
        }
        return merged;
    }
}
