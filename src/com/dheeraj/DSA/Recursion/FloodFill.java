package com.dheeraj.DSA.Recursion;

public class FloodFill {
    public static void main(String[] args) {

    }
    public static void floodFill(int[][] maze , int row , int col , String res , boolean[][] visited){
        if(row <0 || col <0 || row==maze.length || col==maze.length || maze[row][col]==1 || visited[row][col]==true){
            System.out.println(res);
            return;
        }
        visited[row][col] = true;
        floodFill(maze,row-1,col,res+"t",visited);
        floodFill(maze,row,col-1,res+"l",visited);
        floodFill(maze,row+1,col,res+"d",visited);
        floodFill(maze,row,col+1,res+"r",visited);
        visited[row][col] = false;
    }
}
