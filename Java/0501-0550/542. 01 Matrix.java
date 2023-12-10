// https://leetcode.com/problems/01-matrix/

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int rowSize = mat.length;
        int colSize = mat[0].length;
        int MAX_VALUE = rowSize * colSize;

        if(mat == null || rowSize == 0 || colSize == 0)
            return new int[0][0];

        Queue<int[]> storage = new LinkedList<>();

        // Add matrix with 0 to queue
        for(int row = 0; row < rowSize; row++){
            for(int col = 0; col < colSize; col++){
                if(mat[row][col] == 1)
                    mat[row][col] = MAX_VALUE;
                else
                    storage.offer(new int[]{row, col});
            }
        }

        int[][]direction = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        while(!storage.isEmpty()){
            int[]current = storage.poll();

            for(int[] dir : direction){
                int row = current[0] + dir[0], col = current[1] + dir[1];

                //Check if the row and col is in range
                if(row >= 0 && row < rowSize && col >= 0 && col < colSize){
                    if(mat[row][col] > mat[current[0]][current[1]]+1){
                        storage.offer(new int[]{row, col});
                        mat[row][col] = mat[current[0]][current[1]]+1;
                    }
                }
            }
        }

        return mat;
    }
}
