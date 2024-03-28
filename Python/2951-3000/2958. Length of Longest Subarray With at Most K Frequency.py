# https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/

class Solution:
    def maxSubarrayLength(self, nums: List[int], k: int) -> int:
        storage = {}
        size = len(nums)
        left = result = 0

        for right in range(size):
            if nums[right] in storage:
                storage[nums[right]] += 1
            else:
                storage[nums[right]] = 1

            while storage[nums[right]] > k:
                storage[nums[left]] -= 1
                left += 1

            result = max(result, right - left + 1)

        return result
