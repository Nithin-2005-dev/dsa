package arrays.Problems;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int i,int f){
        int temp=arr[i];
        arr[i]=arr[f];
        arr[f]=temp;
    }
}
