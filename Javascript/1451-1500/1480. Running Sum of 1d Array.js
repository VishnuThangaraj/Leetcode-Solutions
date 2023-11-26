// https://leetcode.com/problems/running-sum-of-1d-array/

var runningSum = function(nums) {
    let prefix = nums[0];

    for(let index=1; index<nums.length; index++){
        prefix = nums[index] + prefix;
        nums[index] = prefix;
    }

    return nums;
};
