# https://leetcode.com/problems/majority-element/description/

class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        
        def findMajor(nums, startIndex, reference):
            numCount = 0

            for index in range(startIndex, len(nums)):
                if nums[index] == reference:
                    numCount += 1
                else:
                    numCount -= 1

                # Check if the reference is major or not
                if numCount < 0:
                    return findMajor(nums, index, nums[index])

            return reference


        # array, startIndex, reference
        return findMajor(nums,0,nums[0])
