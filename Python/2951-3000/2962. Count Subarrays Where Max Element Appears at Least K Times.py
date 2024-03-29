# https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times/

class Solution:
    def countSubarrays(self, nums: List[int], k: int) -> int:
        maxNum = max(nums) # Get the num with maximum count
        result = left = right = 0

        while right < len(nums):
            k -= 1 if (nums[right] == maxNum) else 0
            right += 1

            while k == 0:
                k += 1 if (nums[left] == maxNum) else 0
                left += 1

            result += left

        return result
