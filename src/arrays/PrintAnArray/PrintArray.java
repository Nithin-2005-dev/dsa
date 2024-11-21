package arrays.PrintAnArray;

import java.util.Arrays;

public class PrintArray {
    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public static void printArray2D(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
