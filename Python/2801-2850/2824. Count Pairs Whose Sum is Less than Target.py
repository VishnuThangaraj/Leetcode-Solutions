# https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/

class Solution:
    def countPairs(self, nums: List[int], target: int) -> int:
        pairs = 0
        size = len(nums)

        for first in range(0, size):
            for second in range(first+1, size):
                if nums[first] + nums[second] < target:
                    pairs += 1

        return pairs
