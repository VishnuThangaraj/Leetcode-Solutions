# https://leetcode.com/problems/sliding-puzzle/
# https://leetcode.com/problems/sliding-puzzle/solutions/4915573/o-4-20-o-1-java-python-javascript-typescript-recursion-backtracking/

class Solution:
    def slidingPuzzle(self, board: List[List[int]]) -> int:
        result = 99999 # Result
        directions = [(0,1), (0,-1), (1,0), (-1,0)] # Four Directions 

        # Function to check the puzzle is solved or not
        def isPuzzleSolved(board):
            puzzleValue = 1

            for row in range(2):
                for col in range(3):
                    if row == 1 and col == 2:
                        continue # No need to check the 0th position
                    if board[row][col] != puzzleValue:
                        return False
                    puzzleValue += 1

            return True # Puzzle is solved

        # Function to Swap the puzzle pieces 
        def swapPuzzlePiece(board, first, second):
            temp = board[first[0]][first[1]]

            board[first[0]][first[1]] = board[second[0]][second[1]]
            board[second[0]][second[1]] = temp

        def helper_backtrack(board, moves, previous, current):
            if moves >= 20:
                return # More than 20 moves is kind of loop in 2*3 Matrix

            if isPuzzleSolved(board):
                nonlocal result
                result = min(result, moves)
                return # Puzzle is solved

            for dir in directions:
                row = current[0] + dir[0]
                col = current[1] + dir[1]

                """ Check if the row and column lies in the range and 
                    should not be same as previous row and column : (it creates loop) """
                if 0 <= row < 2 and 0 <= col < 3 and (previous[0] != row or previous[1] != col):
                    newMove = [row, col] 
                    
                    swapPuzzlePiece(board, current, newMove) # Swap the puzzle pieces
                    helper_backtrack(board, moves+1, current, newMove) # Recursion
                    swapPuzzlePiece(board, current, newMove) # Backtracking

        zero = (-1,-1) # To store the position of zero(0)

        for row in range(2): # Find the Zero
            for col in range(3):
                if board[row][col] == 0:
                    zero = (row,col)
                    break


        helper_backtrack(board, 0, [-1,-1], zero)

        # return -1 if no Possible way to solve the puzzle
        return -1 if (result == 99999) else result
