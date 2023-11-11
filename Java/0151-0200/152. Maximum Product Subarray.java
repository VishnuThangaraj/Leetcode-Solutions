// https://leetcode.com/problems/maximum-product-subarray/description/

class Solution {
    public int maxProduct(int[] nums) {
        int result = nums[0] , maxProduct = nums[0], minProduct = nums[0];

        for (int index = 1;index < nums.length; index++) {

            int temp = maxProduct;
            maxProduct = Math.max(nums[index], Math.max(nums[index] * maxProduct, nums[index] * minProduct));
            minProduct = Math.min(nums[index], Math.min(nums[index] * minProduct, nums[index] * temp));

            result = Math.max(result, maxProduct); 
        }
        return result;
    }
}
