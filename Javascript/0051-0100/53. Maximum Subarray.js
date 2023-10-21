// https://leetcode.com/problems/maximum-subarray/description/

var maxSubArray = function(nums) {
    let max = Number.MIN_SAFE_INTEGER;
    let sum = 0; // subarray Sum

    for(let num of nums){
        sum += num; // ADD CURRENT ELEMENT TO SUBARRAY SUM
        max = Math.max(max, sum); // update the result
        // check if sum goes below 0
        if(sum < 0){
            sum = 0;
        }
    }
    return max;
};
