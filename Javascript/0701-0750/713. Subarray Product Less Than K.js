// https://leetcode.com/problems/subarray-product-less-than-k/

var numSubarrayProductLessThanK = function(nums, k) {
    if (k <= 1) return 0; // No Possible Subarray found

    let left = 0, right = 0, product = 1, result = 0;
    let size = nums.length;

    while(right < size){
        product *= nums[right];
        
        // Shrink the window till the product is less than or equal to K
        while (product >= k) product /= nums[left++];

        result += 1 + (right - left); // Update result
        right++; // Move right
    }

    return result;
};
