# https://leetcode.com/problems/transpose-matrix/

class Solution:
    def transpose(self, matrix: List[List[int]]) -> List[List[int]]:
        rowSize = len(matrix)
        colSize = len(matrix[0])

        result = []

        for col in range(0, colSize):
            current = []
            for row in range(0, rowSize):
                current.append(matrix[row][col])
            
            result.append(current)

        return result
