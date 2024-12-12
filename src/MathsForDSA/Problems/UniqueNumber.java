package MathsForDSA.Problems;

import arrays.Input.InputAnIntArray;

public class UniqueNumber {
    public static void main(String[] args) {
        int[] arr= InputAnIntArray.ArrayInput();
        int num=0;
        for (int j : arr) {
            num = num ^ j;
        }
        System.out.println(num);
    }
}
