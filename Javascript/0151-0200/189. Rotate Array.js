// https://leetcode.com/problems/rotate-array/

var rotate = function(nums, k) {
    const size = nums.length;
    k %= size; // ensure k is in the range

    reverse(nums, 0, size-1); // Revere Entire Array
    reverse(nums, 0 , k-1); // Rrverse K elements
    reverse(nums, k, size-1); // Reverse remaining elements
};

// Function to reverse elements in the Array
var reverse = function(nums, start, end) {
    while(start < end){
        const temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;end--;
    }
};
