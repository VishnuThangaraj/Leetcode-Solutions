# https://leetcode.com/problems/maximum-product-subarray/description/

class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        result = maxProduct = minProduct = nums[0]

        for index in range(1, len(nums)):
            temp = maxProduct
            maxProduct = max(nums[index], max(nums[index] * maxProduct, nums[index] * minProduct))
            minProduct = min(nums[index], min(nums[index] * minProduct, nums[index] * temp))

            # update result
            result = max(result, maxProduct)

        return result
