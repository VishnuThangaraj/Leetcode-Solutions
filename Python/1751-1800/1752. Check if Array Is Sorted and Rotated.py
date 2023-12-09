# https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/

class Solution:
    def check(self, nums: List[int]) -> bool:
        count, size = 0, len(nums)

        for index in range (1, size):
            if nums[index-1] > nums[index]:
                count += 1

        # Checks
        if count == 0:
            return True # Sorted Array
        elif count > 1:
            return False
        elif nums[0] >= nums[size-1]:
            return True # sorted and rotated

        return False
