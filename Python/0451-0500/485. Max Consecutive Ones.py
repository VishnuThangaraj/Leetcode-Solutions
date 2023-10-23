# https://leetcode.com/problems/max-consecutive-ones/description/

class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        oneCount, result = 0, 0

        for index in range(0, len(nums)):
            if nums[index] == 0:
                # update result
                result = max(result, oneCount)
                oneCount = 0
            else:
                oneCount += 1

        return max(result, oneCount)
