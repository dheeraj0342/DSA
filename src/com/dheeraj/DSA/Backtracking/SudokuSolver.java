package com.dheeraj.DSA.Backtracking;
public class SudokuSolver {
    public void solveSudoku(char[][] board) {
        helper(board,0,0);
    }
    public boolean helper(char[][] board , int i, int j){
        if(i==board.length){
            return true;
        }
        int ni = 0;
        int nj=0;
        if(j==board[0].length-1){
            ni = i +1;
            nj=0;
        }else{
            ni = i;
            nj = j+1;
        }
        if(board[i][j]!='.'){
            return helper(board,ni,nj);
        }
        for(char op ='1';op<='9';op++){
            if(isValid(board,i,j,op)){
                board[i][j]=op;
                if(helper(board,ni,nj))
                    return true;
                board[i][j]='.';
            }
        }
        return false;


    }
    public boolean isValid(char[][] board, int row , int col , char op){
        for(int i=0;i<board[0].length;i++){
            if(board[row][i]==op){
                return false;
            }
        }
        for(int i=0;i<board.length;i++){
            if(board[i][col]==op){
                return false;
            }
        }
        int smi = 3*(row/3);
        int smj = 3*(col/3);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[smi+i][smj+j]==op){
                    return false;
                }
            }
        }
        return true;
    }

}
