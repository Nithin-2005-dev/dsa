package arrays.Problems;

public class MaximumValueOfArray {
    public static void main(String[] args) {
        int[] arr={1,44,66,1,8};
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
