package arrays.Input;

import java.util.Scanner;

public class InputAnIntArray {
    public static int[] ArrayInput(){
        Scanner in=new Scanner(System.in);
        System.out.print("enter size of an array:-");
        int n=in.nextInt();
        System.out.print("enter elements in an array:-");
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        return arr;
    }
    public static int[][] ArrayInput2D(){
        Scanner in=new Scanner(System.in);
        System.out.print("enter rows of an array:-");
        int r=in.nextInt();
        System.out.print("enter columns of an array:-");
        int c=in.nextInt();
        System.out.print("enter elements in an array:-");
        int[][] arr=new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j]=in.nextInt();
            }
        }
        return arr;
    }
}
