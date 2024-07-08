package com.dheeraj.DSA.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class GlodMinePath {

        public int getMaximumGold(int[][] grid) {
            boolean[][] visited = new boolean[grid.length][grid[0].length];
            int max=0;
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j] !=0 && visited[i][j]==false){
                        List<Integer> bag = new ArrayList<>();
                        getAllPathSum(grid,i,j,bag,visited);
                        int sum=0;
                        for(int ele : bag){
                            sum += ele;
                        }
                        if(sum > max){
                            max = sum;
                        }
                    }

                }
            }
            return max;
        }
        public void getAllPathSum(int[][]grid, int i , int j , List<Integer> bag , boolean[][]visited){
            if(i<0 || j<0 || i>=grid.length || j>= grid[0].length || grid[i][j]==0 || visited[i][j]==true)
                return;
            visited[i][j] = true;
            bag.add(grid[i][j]);
            getAllPathSum(grid,i+1,j,bag,visited);
            getAllPathSum(grid,i-1,j,bag,visited);
            getAllPathSum(grid,i,j+1,bag,visited);
            getAllPathSum(grid,i,j-1,bag,visited);
        }


}
