// https://leetcode.com/problems/shuffle-the-array/

var shuffle = function(nums, n) {
    const result = [];

    for(let index=0; index<n; index++){
        result.push(nums[index]);
        result.push(nums[n+index]);
    }

    return result;
};
