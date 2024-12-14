package Sorting;

import arrays.Input.InputAnIntArray;

import java.util.Arrays;

public class QuickSort {
    //pivot:choose any element->after first pass all the elements less than pivot will be left side of pivot and elements greater than pivot will be right side of pivot
    public static void main(String[] args) {
        int[] arr= InputAnIntArray.ArrayInput();
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    /*
    how to pick pivot:-
    ->you can either put the random elements or the corner elements.
    ->you can put always the middle element

    |worst case is choosing the corner elements because it causes the more recursion calls O(n^2)
    |best case is dividing it into two half O(nlog(n))

    ->it is unstable
    ->merge sort is better in linked list due to memory allocation is not continues
     */
    static void sort(int[] arr,int l,int h){
        if(l>=h){
            return;
        }
        int s=l;
        int e=h;
        int p=s+(e-s)/2;

        while (s<=e){
            while (arr[s]<arr[p]){
                s++;
            }
            while (arr[e]>arr[p]){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        sort(arr,l,e);
        sort(arr,s,h);
    }

    /*
    hybrid sorting algorithm(tim sort):
    ->merge sort+insertion sort
     */
}
