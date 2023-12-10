// https://leetcode.com/problems/transpose-matrix/

class Solution {
    public int[][] transpose(int[][] matrix) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;

        int[][] result = new int[colSize][rowSize];

        for(int col = 0; col<colSize; col++){
            for(int row = 0; row < rowSize; row++){
                result[col][row] = matrix[row][col];
            }
        }

        return result;
    }
}
