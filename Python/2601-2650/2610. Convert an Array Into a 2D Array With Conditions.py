# https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/

# https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/solutions/4490403/o-n-java-python-javascript-linear-solution/

class Solution:
    def findMatrix(self, nums: List[int]) -> List[List[int]]:

        frequency = {}
        result = []

        for num in nums:
            if num not in frequency:
                frequency[num] = 0
            if frequency[num] >= len(result): # Create new Row
                result.append([])
            
            result[frequency[num]].append(num)
            frequency[num] += 1
        
        return result
