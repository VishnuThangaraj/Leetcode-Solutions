# https://leetcode.com/problems/pascals-triangle/description/

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = []
        dummy = []
        dummy.append(1)
        result.append(dummy)

        for row in range(0, numRows-1):
            current = []
            current.append(1)

            for index in range(0, len(result)-1):
                current.append(result[row][index]+result[row][index+1])
            
            current.append(1)
            result.append(current)
        
        return result
   
