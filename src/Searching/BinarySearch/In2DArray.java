package Searching.BinarySearch;
import arrays.Input.InputAnIntArray;

import java.util.Arrays;

public class In2DArray {
    public static void main(String[] args) {
    int[][] matrix=InputAnIntArray.ArrayInput2D();
        System.out.println(Arrays.toString(search(matrix,10)));
    }
    static int[] search(int[][] matrix,int target){
        int r=0;
        int c= matrix.length-1;
        while(r< matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int[]{r,c};
            }
            if (matrix[r][c]<target) {
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search1(int[][] matrix,int target){
        int rows=matrix.length;
        int cols=matrix[0].length;
        if(rows==1){
            return bSearch(matrix,0,0,cols-1,target);
        }
        int rs=0;
        int re=rows-1;
        int cm=cols/2;
        while(rs<(re-1)){
            int mid=rs+(re-rs)/2;
            if(matrix[mid][cm]==target){
                return new int[]{mid,cm};
            }
            if(matrix[mid][cm]<target){
                rs=mid;
            }else{
                re=mid;
            }
        }
        //now we have two rows
        //check weather the target is in the col of two rows
        if(matrix[rs][cm]==target){
            return new int[]{rs,cm};
        }
        if(matrix[re][cm]==target){
            return new int[]{re,cm};
        }
        //search in 1st half
        if(target<=matrix[rs][cm-1]){
            return bSearch(matrix,rs,0,cm-1,target);
        }
        //search in 2nd half
        if(target<=matrix[rs][cm+1] && target<=matrix[rs][cols-1] ){
            return bSearch(matrix,rs,cm+1,cols-1,target);
        }
        //search in 3rd half
        if(target<=matrix[rs+1][cm-1]){
            return bSearch(matrix,rs+1,0,cm-1,target);
        }
        //search in 4th half
        if(target<=matrix[rs+1][cm+1]){

        }
    }
    static int[] bSearch(int[][] matrix,int r,int cs,int ce,int target){
        while(cs<=ce){
            int mid=cs+(ce-cs)/2;
            if(matrix[r][mid]==target){
                return new int[]{r,mid};
            }else if(matrix[r][mid]<target){
                cs=mid+1;
            }else{
                ce=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}
