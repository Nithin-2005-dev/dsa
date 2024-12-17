package Recursion.BackTracking.Problems;

import java.util.Arrays;

public class NQueens {
    public static void main(String[] args) {
        boolean[][] board=new boolean[5][5];
        solve(board,0);
    }
    static void solve(boolean[][] board,int r){
        if(r==board.length){
            for (int i = 0; i < board.length; i++) {
                System.out.println(Arrays.toString(board[i]));
            }
            System.out.println();
            return;
        }
        for(int i=0;i<board.length;i++){
            if(check(board,r,i)){
                board[r][i]=true;
                solve(board,r+1);
                board[r][i]=false;
            }
        }
        return ;
    }
    static boolean check(boolean[][] board,int r,int c){
        for(int i=0;i<c;i++){
            if(board[r][i]){
                return false;
            }
        }
        for(int i=0;i<r;i++){
            if(board[i][c]){
                return false;
            }
        }
        for(int i=1;i<=Math.min(r,c);i++){
            if(board[r-i][c-i]){
                return false;
            }
        }
        for(int i=1;i<=Math.min(r, board.length-c-1);i++){
            if(board[r-i][c+i]){
                return false;
            }
        }
        return true;
    }
}
