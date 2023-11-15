# https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

class Solution:
    def findMin(self, nums: List[int]) -> int:
        # Single elemnet in the array 
        if(len(nums) == 1):
            return nums[0]

        start, end = 0,len(nums)-1

        while(start <= end):
            mid = start + (end - start) // 2;

            # Min element in end of the array
            if(mid == len(nums)-1):
                if(nums[mid] < nums[mid-1]):
                    return nums[mid] # Last Element in the array is the minimum
                else:
                    end = mid-1
            elif(mid == 0):
                if(nums[mid] < nums[mid+1]):
                    return nums[mid] # First Element in the array is minimum
                else:
                    start = mid+1
            else:
                if(nums[mid] < nums[mid-1] and nums[mid] < nums[mid+1]):
                    return nums[mid]
                elif (nums[start] <= nums[end]): # Sorted range
                    return nums[start]
                else: # un-sorted Range
                    if(nums[start] <= nums[mid]):
                        start = mid+1
                    else:
                        end = mid-1

        return end
        
