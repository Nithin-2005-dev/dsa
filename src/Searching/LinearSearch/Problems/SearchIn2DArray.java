package Searching.LinearSearch.Problems;
import arrays.Input.InputAnIntArray;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr=InputAnIntArray.ArrayInput2D();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]==10){
                    System.out.println(Arrays.toString(new int[]{i,j}));
                }
            }
        }
    }
}
