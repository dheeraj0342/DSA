package com.dheeraj.DSA.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public List<List<String>> res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        boolean[] cols = new boolean[n];
        boolean[] ndiag = new boolean[2*n-1];
        boolean[] rdiag = new boolean[2*n-1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] ='.';
            }
        }
        solve(board,cols,ndiag,rdiag,0);
        return res;
    }
    public void solve(char[][]board, boolean[] cols , boolean[] ndiag , boolean[] rdiag, int row){
        if(row == board.length){
            printBoard(board);
            return;
        }
        for(int col=0;col<board.length;col++){
            if(cols[col]==false && ndiag[row+col]==false && rdiag[row-col+board.length-1]==false ){
                board[row][col] = 'Q';
                cols[col] = true;
                ndiag[row+col] = true;
                rdiag[row-col+board.length-1]=true;
                solve(board,cols,ndiag,rdiag,row+1);
                board[row][col] = '.';
                cols[col] = false;
                ndiag[row+col] = false;
                rdiag[row-col+board.length-1]=false;
            }
        }
    }
    public void printBoard(char[][] board){
        List<String> ls = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String temp ="";
            for(int j=0;j<board.length;j++){
                temp += board[i][j];
            }
            ls.add(temp);
        }
        res.add(ls);
    }
}
