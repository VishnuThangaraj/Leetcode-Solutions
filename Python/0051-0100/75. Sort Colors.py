# https://leetcode.com/problems/sort-colors/

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        count = [0,0,0]

        for num in nums:
            count[num] += 1 # Count the occurance of 0,1 & 2
        
        index = 0
        for value in range(0,3):
            for occurance in range(0, count[value]):
                nums[index] = value
                index+=1
