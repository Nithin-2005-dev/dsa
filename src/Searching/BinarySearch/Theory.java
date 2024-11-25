package Searching.BinarySearch;
import arrays.Input.InputAnIntArray;
public class Theory {
    public static void main(String[] args) {
        int[] arr=InputAnIntArray.ArrayInput();
        System.out.println(oAsearch(arr,10));
    }
    static int search(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]<target){
                s=m+1;
            }else if(arr[m]>target){
                e=m-1;
            }else{
                return m;
            }
        }
        return -1;
    }
    static int oAsearch(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        if(arr[s]<arr[e]) {
            while (s <= e) {
                int m = s + (e - s) / 2;
                if (arr[m] < target) {
                    s = m + 1;
                } else if (arr[m] > target) {
                    e = m - 1;
                } else {
                    return m;
                }
            }
        }else{
            while (s <= e) {
                int m = s + (e - s) / 2;
                if (arr[m] > target) {
                    s = m + 1;
                } else if (arr[m] < target) {
                    e = m - 1;
                } else {
                    return m;
                }
            }
        }
        return -1;
    }
}
