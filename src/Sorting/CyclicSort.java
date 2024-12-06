package Sorting;
import arrays.Input.InputAnIntArray;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr=InputAnIntArray.ArrayInput();
        //when given numbers from range 1 to n use cyclic sort
        //index=value-1
        //worst case complexity O(n)
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i+1){
                int j=arr[i]-1;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
