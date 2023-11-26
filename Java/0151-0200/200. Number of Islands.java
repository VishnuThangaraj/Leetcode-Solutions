// https://leetcode.com/problems/number-of-islands/

class Solution {
    // Depth First Search
    public void DFS(char[][] grid, int n, int m , int row, int col){
        // Out of Bounds or already visited
        if(row < 0 || row >=n || col < 0 || col >= m || grid[row][col] != '1'){
            return;
        }

        // Mark as visited
        grid[row][col] = '0';

        // visit four directions
        DFS(grid, n, m, row-1, col); // UP
        DFS(grid, n, m, row+1, col); // DOWN
        DFS(grid, n, m, row, col-1); // LEFT
        DFS(grid, n, m, row, col+1); // RIGHT
    }
    public int numIslands(char[][] grid) {
        int n = grid.length, m = grid[0].length;
        int islandCount = 0;

        // find the islands
        for(int row =0; row<n; row++){
            for(int col=0; col<m; col++){
                //un-visited Island found
                if(grid[row][col] == '1'){
                    islandCount++;
                    DFS(grid, n, m, row, col); // Visit all the continous islands
                }
            }
        }

        return islandCount;
    }
}
