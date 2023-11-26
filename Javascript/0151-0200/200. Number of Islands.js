// https://leetcode.com/problems/number-of-islands/

// Depth First Search
var DFS = function(grid, n, m , row, col){
    // Out of Bounds or already visited
    if(row < 0 || row >=n || col < 0 || col >= m || grid[row][col] != "1"){
        return;
    }

    // Mark as visited
    grid[row][col] = "0";

    // visit four directions
    DFS(grid, n, m, row-1, col); // UP
    DFS(grid, n, m, row+1, col); // DOWN
    DFS(grid, n, m, row, col-1); // LEFT
    DFS(grid, n, m, row, col+1); // RIGHT
}
var numIslands = function(grid) {
    let n = grid.length, m = grid[0].length;
    let islandCount = 0;

    // find the islands
    for(let row =0; row<n; row++){
        for(let col=0; col<m; col++){
            //un-visited Island found
            if(grid[row][col] == "1"){
                islandCount++;
                DFS(grid, n, m, row, col); // Visit all the continous islands
            }
        }
    }

    return islandCount;
};
