// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/

var check = function(nums) {
    let count = 0, size = nums.length;

    for(let index=1; index<size; index++){
        if(nums[index-1] > nums[index]) count++;
    }

    // Checks
    if(count == 0) return true; // Sorted Array
    else if(count > 1) return false;
    else if (nums[0] >= nums[size-1]) return true; // sorted and rotated

    return false;
};
