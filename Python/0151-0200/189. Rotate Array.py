# https://leetcode.com/problems/rotate-array/

class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        # Function to reverse elements in the Array
        def reverse(nums, start, end):
            while start < end :
                temp = nums[start]
                nums[start] = nums[end]
                nums[end] = temp
                start += 1
                end -= 1
        
        size = len(nums)
        k %= size # ensure k is in the range

        reverse(nums, 0, size-1) # Revere Entire Array
        reverse(nums, 0 , k-1) # Rrverse K elements
        reverse(nums, k, size-1) # Reverse remaining elements
