package Recursion.BackTracking.Problems;

import java.util.Arrays;

public class NKnights {
    public static void main(String[] args) {
        boolean[][] board=new boolean[3][3];
        solve(board,0,0,3);
    }
    static void solve(boolean[][] board,int r,int c,int k){
        if(k==0){
            for (int i = 0; i < board.length; i++) {
                System.out.println(Arrays.toString(board[i]));
            }
            System.out.println();
            return;
        }
        if(r== board.length-1 && c==board.length){
            return;
        }
        if(c== board.length){
            solve(board,r+1,0,k);
        }
        if(check(board,r,c)){
            board[r][c]=true;
            solve(board,r,c+1,k-1);
            board[r][c]=false;
        }
        solve(board,r,c+1,k);
        return ;
    }
    static boolean isValid(boolean[][] board,int r,int c){
        if(r>00 && r< board.length && c>=0 && c< board.length){
            return true;
        }
        return false;
    }
    static boolean check(boolean[][] board,int r,int c){
        if(isValid(board,r-2,c-1)) {
            if (board[r - 2][c - 1]) {
                return false;
            }
        }
        if(isValid(board,r-1,c-2)) {
            if (board[r - 1][c - 2]) {
                return false;
            }
        }
        if(isValid(board,r-2,c+1)) {
            if (board[r - 2][c +1]) {
                return false;
            }
        }
        if(isValid(board,r-1,c+2)) {
            if (board[r - 1][c +2]) {
                return false;
            }
        }
        return true;
    }
}
