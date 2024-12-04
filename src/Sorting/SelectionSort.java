package Sorting;
import arrays.Input.InputAnIntArray;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
    int[] arr=InputAnIntArray.ArrayInput();
    //it is unstable algorithm
    //best case complexity is O(n^2)
    //worst case complexity is O(n^2)
    //it performs well for small arrays
        for (int i = 0; i < arr.length; i++) {
            int maxI=-1;
            int max=arr[0];
            for (int j = 0; j < arr.length-i; j++) {
                if(max<=arr[j]){
                    max=arr[j];
                    maxI=j;
                }
            }
            int temp=arr[maxI];
            arr[maxI]=arr[arr.length-1-i];
            arr[arr.length-i-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
