package Recursion.Problems;
import arrays.Input.InputAnIntArray;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr= InputAnIntArray.ArrayInput();
        sort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int i,int j){
        if(i==0){
            return;
        }
        if(j<i){
            if(arr[j]>arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            sort(arr,i,++j);
        }else {
            sort(arr,--i,0);
        }
    }
}
