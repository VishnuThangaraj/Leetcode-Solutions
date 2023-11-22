# https://leetcode.com/problems/concatenation-of-array/

class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        # Easy Solution
        # return nums + nums
        
        size = len(nums)
        result = []

        for index in range(0, 2*size):
            result.append(nums[index%size])

        return result
