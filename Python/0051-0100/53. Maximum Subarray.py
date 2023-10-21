# https://leetcode.com/problems/maximum-subarray/description/

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        result = -922337203685477580 # possible minimum value
        sum = 0 # subarraySum

        for num in nums:
            sum += num # add the current element to subarray sum
            # update result
            result = max(result, sum)

            if sum < 0:
                sum = 0
        
        return result;
