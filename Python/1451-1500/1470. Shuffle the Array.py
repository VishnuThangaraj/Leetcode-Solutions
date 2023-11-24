# https://leetcode.com/problems/shuffle-the-array/

class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        result = []

        for index in range (0, n):
            result.append(nums[index])
            result.append(nums[n+index])

        return result
