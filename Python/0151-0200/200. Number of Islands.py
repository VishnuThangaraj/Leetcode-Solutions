# https://leetcode.com/problems/number-of-islands/

class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        n, m = len(grid), len(grid[0])
        islandCount = 0

        def DFS(row, col):
            # Out of Bounds or already visited
            if row < 0 or row >=n or col < 0 or col >= m or grid[row][col] != "1":
                return

            # Mark as visited
            grid[row][col] = "0"

            # visit four directions
            DFS(row-1, col) # UP
            DFS(row+1, col) # DOWN
            DFS(row, col-1) # LEFT
            DFS(row, col+1) # RIGHT

        # find the islands
        for row in range(0, n):
            for col in range(0, m):
                # un-visited Island found
                if grid[row][col] == "1":
                    islandCount += 1
                    DFS(row, col) # Visit all the continous islands

        return islandCount
