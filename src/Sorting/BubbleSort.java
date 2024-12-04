package Sorting;
import arrays.Input.InputAnIntArray;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr=InputAnIntArray.ArrayInput();
        for (int i = 0; i < arr.length; i++) {
            //for every loop the largest element will be at last position
            //worst case complexity is O(n^2)
            //best case also O(n)
            //space complexity is O(1)
            //aka in place sorting algorithm
            //it is stable sorting algorithm
            boolean check=true;
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j+1]<arr[j]){
                    check=false;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
            if(check){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
