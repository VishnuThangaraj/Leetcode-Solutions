# https://leetcode.com/problems/product-of-array-except-self/description/

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        size = len(nums)
        # calculate the left and the right sum
        left = []
        right = []

        # Calculate the left sum
        left.append(1)
        for index in range(1, size):
            left.append(left[index-1] * nums[index-1])

        # calculate the right sum
        right.append(1)
        for index in reversed(range(0, size-1)):
            right.insert(0, right[0] * nums[index+1])

        # calculate the result 
        result = []
        for index in range(0, size):
            result.append(left[index] * right[index])

        return result;
