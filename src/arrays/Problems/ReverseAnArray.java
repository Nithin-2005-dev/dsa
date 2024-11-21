package arrays.Problems;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr={1,44,66,1,8};
        for (int i = 0; i < arr.length/2; i++) {
            swap(arr,i,arr.length-i-1);
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int i,int f){
        int temp=arr[i];
        arr[i]=arr[f];
        arr[f]=temp;
    }
}
