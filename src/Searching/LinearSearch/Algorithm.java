package Searching.LinearSearch;

import java.util.Scanner;
import arrays.Input.InputAnIntArray;
public class Alogorithm {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=InputAnIntArray.ArrayInput();
        System.out.print("enter target:-");
        int target=input.nextInt();
        System.out.println(isElementPresent(arr,target));
    }
    public static Boolean isElementPresent(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
}
