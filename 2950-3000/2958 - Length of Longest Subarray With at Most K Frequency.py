'''
2958. Length of Longest Subarray With at Most K Frequency
https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/description/

Solution
https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/solutions/8455771/longest-subarray-with-at-most-k-frequenc-gz5c/
'''
class Solution:
    def maxSubarrayLength(self, nums: list[int], k: int) -> int:
        result = 0
        start = 0

        storage = {}

        for end in range(len(nums)):
            storage[nums[end]] = storage.get(nums[end], 0) + 1

            # Shrink window if frequency exceeds k
            while storage[nums[end]] > k:
                storage[nums[start]] -= 1
                start += 1

            result = max(result, end - start + 1)

        return result
