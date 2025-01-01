package Sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountSort {
    /*
    ->non -comparison sorting algorithm
    ->good for smaller numbers

    Implementation:
    ->find the largest element
    ->create the array with size of largest element
    ->update the frequencies of elements in respective indices
     */
    public static void main(String[] args) {
    int[] arr={4,6,1,4,2,3};
    countSortHash(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void countSort(int[] arr){
        if(arr==null || arr.length==0){
            return;
        }
        int max=arr[0];
        for(int num:arr){
            if(max<num){
                max=num;
            }
        }
        int[] count=new int[max+1];
        for (int num:arr){
            count[num]++;
        }
        int index=0;
        for (int i = 0; i <=max; i++) {
            while (count[i]>0){
                arr[index]=i;
                index++;
                count[i]--;
            }
        }
    }
    public static void countSortHash(int[] arr){
        if(arr==null || arr.length==0){
            return;
        }
        int max=Arrays.stream(arr).max().getAsInt();
        int min=Arrays.stream(arr).min().getAsInt();
        Map<Integer,Integer> countMap=new HashMap<>();
        for (int num:arr){
            countMap.put(num,countMap.getOrDefault(num,0)+1);
        }
        int index=0;
        for (int i = min; i <=max ; i++) {
            int count=countMap.getOrDefault(i,0);
            for (int j = 0; j < count; j++) {
                arr[index]=i;
                index++;
            }
        }
    }
}
