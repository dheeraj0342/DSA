package com.dheeraj.DSA.Recursion;

import java.util.List;

public class PrintNQueens {
    public static void main(String[] args) {
        int n = 4;
        int[][] chess = new int[n][n];
        printNQueens(chess,0,"");
    }
    public static void printNQueens(int[][] chess,int row , String res ){
        if(row==chess.length){
            System.out.println(res);
            return;
        }

        for(int col=0;col<chess.length;col++){
            if(isItaValidPlaceForTheQueen(chess,row,col)){
                chess[row][col]=1;
                printNQueens(chess,row+1,res+row+"-"+col+", ");
                chess[row][col]=0;
            }

        }
    }
    public static boolean isItaValidPlaceForTheQueen(int[][] chess , int row ,int col){
        for(int i=row-1,j=col;i>=0;i--){
            if(chess[i][j]==1)
                return false;
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0; i--,j--){
            if(chess[i][j]==1)
                return false;
        }
        for (int i=row-1,j=col+1;i>=0&&j<chess.length;i--,j++){
            if(chess[i][j]==1)
                return false;
        }
        return true;
    }
}
