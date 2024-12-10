package Recursion.Problems;
import arrays.Input.InputAnIntArray;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr=InputAnIntArray.ArrayInput();
        System.out.println(search(arr,0,arr.length-1,10));
    }

    private static int search(int[] arr, int s, int e,int t) {
        int m=s+(e-s)/2;
        if(s>e){
            return -1;
        }
        if(arr[m]==t){
            return m;
        }else if(arr[m]<t){
           return search(arr,m+1,e,t);
        }else {
            return search(arr, s, m - 1, t);
        }
    }
}
