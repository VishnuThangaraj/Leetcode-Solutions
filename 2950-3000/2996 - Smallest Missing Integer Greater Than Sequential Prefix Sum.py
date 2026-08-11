'''
2996. Smallest Missing Integer Greater Than Sequential Prefix Sum
https://leetcode.com/problems/smallest-missing-integer-greater-than-sequential-prefix-sum/

Solution
https://leetcode.com/problems/smallest-missing-integer-greater-than-sequential-prefix-sum/solutions/8453571/missing-integer-using-prefix-sum-and-has-iwlr
'''

class Solution:
    def missingInteger(self, nums: list[int]) -> int:
        prefix_sum = nums[0]
        storage = set(nums)

        index = 1

        # Find the sum of the longest consecutive prefix
        while index < len(nums) and nums[index] == nums[index - 1] + 1:
            prefix_sum += nums[index]
            index += 1

        # Find the smallest missing integer
        while prefix_sum in storage:
            prefix_sum += 1

        return prefix_sum
