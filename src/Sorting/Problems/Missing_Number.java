package Sorting.Problems;
import arrays.Input.InputAnIntArray;
public class Missing_Number {
    public static void main(String[] args) {
        int[] arr=InputAnIntArray.ArrayInput();
        int i=0;
        while (i<arr.length) {
            int correct=arr[i];
            if(arr[i]!=i && correct<arr.length){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            if(arr[k]!=k){
                System.out.println(k);
            }
        }
    }
}
