# https://leetcode.com/problems/subarray-product-less-than-k/

class Solution:
    def numSubarrayProductLessThanK(self, nums: List[int], k: int) -> int:
        if k <= 1: # No Possible Subarray found
            return 0

        left, right, product, result = 0, 0, 1, 0
        size = len(nums)

        while right < size:
            product *= nums[right]
            
            # Shrink the window till the product is less than or equal to K
            while product >= k:
                product /= nums[left]
                left += 1

            result += 1 + (right - left) #Update result
            right += 1 # Move right

        return result
