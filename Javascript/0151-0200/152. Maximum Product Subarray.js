// https://leetcode.com/problems/maximum-product-subarray/description/

var maxProduct = function(nums) {
    let result = nums[0] , maxProduct = nums[0], minProduct = nums[0];

    for (let index = 1;index < nums.length; index++) {

        let temp = maxProduct;
        maxProduct = Math.max(nums[index], Math.max(nums[index] * maxProduct, nums[index] * minProduct));
        minProduct = Math.min(nums[index], Math.min(nums[index] * minProduct, nums[index] * temp));

        result = Math.max(result, maxProduct); 
    }
    return result;
};
