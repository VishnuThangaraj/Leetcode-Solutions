/*
https://leetcode.com/problems/sliding-puzzle/
https://leetcode.com/problems/sliding-puzzle/solutions/4915573/o-4-20-o-1-java-python-javascript-typescript-recursion-backtracking/
*/

class Solution {
    int result = Integer.MAX_VALUE; // Result
    int[][] directions = {{0,1}, {0,-1}, {1,0}, {-1,0}}; // Four Directions 

    public int slidingPuzzle(int[][] board) {
        int[] zero = {-1,-1}; // To store the position of zero(0)

        for(int row=0; row<2; row++){ // Find the Zero
            for(int col=0; col<3; col++){
                if(board[row][col] == 0){
                    zero = new int[]{row,col};
                    break;
                }
            }
        }

        helper_backtrack(board, 0, new int[]{-1,-1}, zero);

        // return -1 if no Possible way to solve the puzzle
        return (result == Integer.MAX_VALUE) ? -1 : result; 
    }

    public void helper_backtrack(int[][] board, int moves, int[] previous, int[] current){
        if(moves >= 20) return; // More than 20 moves is kind of loop in 2*3 Matrix

        if(isPuzzleSolved(board)){
            result = Math.min(result, moves);
            return; // Puzzle is solved
        }

        for(int[] dir : directions){
            int row = current[0] + dir[0];
            int col = current[1] + dir[1];

            /* Check if the row and column lies in the range and 
                should not be same as previous row and column : (it creates loop) */
            if(row<0 || row>=2 || col<0 || col>=3 || (previous[0] == row && previous[1] == col)){
                continue;
            }

            int[] newMove = {row, col}; 
            
            swapPuzzlePiece(board, current, newMove); // Swap the puzzle pieces
            helper_backtrack(board, moves+1, current, newMove); // Recursion
            swapPuzzlePiece(board, current, newMove); // Backtracking

        }
    }

    // Function to Swap the puzzle pieces 
    public void swapPuzzlePiece(int[][] board, int[]first, int[]second){
        int temp = board[first[0]][first[1]];

        board[first[0]][first[1]] = board[second[0]][second[1]];
        board[second[0]][second[1]] = temp;
    }

    // Function to check the puzzle is solved or not
    public boolean isPuzzleSolved(int[][] board){
        int puzzleValue = 1;

        for(int row=0; row<2; row++){
            for(int col=0; col<3; col++){
                if(row == 1 && col == 2) continue; // No need to check the 0th position
                if(board[row][col] != puzzleValue++) return false;
            }
        }

        return true; // Puzzle is solved
    }
}
