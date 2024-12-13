package Recursion.Problems;

import arrays.Input.InputAnIntArray;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr= InputAnIntArray.ArrayInput();
        sort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int i,int j,int maxI){
        if(i==0){
            return;
        }
        if(j<i){
            if(arr[j]>arr[maxI]){
                sort(arr,i,++j,j);
            }else{
                sort(arr,i,++j,maxI);
            }
        }else{
            int temp=arr[i-1];
            arr[i-1]=arr[maxI];
            arr[maxI]=temp;
            sort(arr,i-1,0,0);
        }

    }
}
