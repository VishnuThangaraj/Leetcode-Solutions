// https://leetcode.com/problems/concatenation-of-array/

var getConcatenation = function(nums) {
    // Easy solution
    // return [...nums, ...nums];
    
    let size = nums.length;
    let result = [];

    for(let index=0; index<2*size; index++){
        result.push(nums[index%size]);
    }

    return result;
};
