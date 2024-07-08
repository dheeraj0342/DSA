package com.dheeraj.DSA.Recursion;

public class PrintKnightTour {
    public static void main(String[] args) {
        int n = 3;
        int[][] chess = new int[n][n];
        printKnightTour(chess,1,2,1);
    }
    public static void printKnightTour(int[][]chess , int row , int col, int move){

        if(row<0 || col <0 || row >=chess.length || col >= chess.length || chess[row][col] >0){
            return;
        }else if(move == chess.length * chess.length){
            chess[row][col] = move;
            displayChessBoard(chess);
            return;
        }

        chess[row][col] = move;
        printKnightTour(chess,row-2,col+1,move+1);
        printKnightTour(chess,row-1,col+2,move+1);
        printKnightTour(chess,row+1,col+2,move+1);
        printKnightTour(chess,row+2,col+1,move+1);
        printKnightTour(chess,row-2,col-1,move+1);
        printKnightTour(chess,row-1,col-2,move+1);
        printKnightTour(chess,row+1,col-2,move+1);
        printKnightTour(chess,row+2,col-1,move+1);
        chess[row][col] =0;

    }
    public static void displayChessBoard(int[][] chess){
        for(int i=0;i<chess.length;i++){
            for(int j=0;j<chess.length;j++){
                System.out.print(chess[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
    }


}
