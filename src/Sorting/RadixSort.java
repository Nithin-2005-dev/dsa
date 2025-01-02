package Sorting;

import java.util.Arrays;

public class RadixSort {
    /*
    sort the array,using count sort,digit by digit,sorting from last
     */
    public static void main(String[] args) {
        int[] arr={1,5,2,88,445,7423,4432};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void radixSort(int[] arr){
        int max= Arrays.stream(arr).max().getAsInt();
        //do count sort for every digit place
        for (int i = 1; max/i>0 ; i*=10) {
            countSort(arr,i);
        }
    }
    public static void countSort(int[] arr,int exp){
        int n=arr.length;
        int[] outPut=new int[n];
        int[] count=new int[10];
        for (int i = 0; i < n; i++) {
            count[(arr[i]/exp)%10]++;
        }
        for (int i = 1; i < 10; i++) {
                count[i] = count[i] + count[i - 1];
        }
        for (int i = n-1; i >=0 ; i--) {
    outPut[count[(arr[i]/exp)%10]-1]=arr[i];
            count[(arr[i]/exp)%10]--;
        }
        System.arraycopy(outPut,0,arr,0,n);
    }
}
