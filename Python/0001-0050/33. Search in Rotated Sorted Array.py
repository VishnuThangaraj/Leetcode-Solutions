# https://leetcode.com/problems/search-in-rotated-sorted-array/description/

class Solution:
    def search(self, nums: List[int], target: int) -> int:
        def binarySearch(nums, target, start, end):
            if start > end:
                return -1 # Target not found
            
            mid = start + (end - start)//2 # Mid-postion

            if(nums[mid] == target):
                return mid # Target found

            # Check if the range is sorted
            if nums[start] <= nums[mid]:
                if nums[start] <= target and nums[mid]>=target:
                    return binarySearch(nums, target, start, mid-1) # Search in left range
                else:
                    return binarySearch(nums, target, mid+1, end) # Search in right range
            
            # If the range is un-sorted
            if nums[mid]<=target and nums[end]>=target:
                return binarySearch(nums, target, mid+1, end) # Search in right range
            else:
                return binarySearch(nums, target, start, mid-1) # Search in left range
            
        # Recursive Binary Search
        return binarySearch(nums, target, 0, len(nums)-1)
