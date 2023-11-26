# https://leetcode.com/problems/running-sum-of-1d-array/

class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        prefix = nums[0]

        for index in range(1, len(nums)):
            prefix = nums[index] + prefix
            nums[index] = prefix

        return nums
        
