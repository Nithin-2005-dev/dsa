package Sorting;
import arrays.Input.InputAnIntArray;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr=InputAnIntArray.ArrayInput();
        //for every index you are at put that element at it's correct position of left hand side
        //best case time complexity is O(n)
        //worst case time complexity if O(n^2)
        //good for partially sorted arrays
        //it is stable
        int i=0;
        int j=1;
        while(i<arr.length-1){
            if(j>0 && arr[j]<arr[j-1] ){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }else{
                i++;
                j=i+1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
