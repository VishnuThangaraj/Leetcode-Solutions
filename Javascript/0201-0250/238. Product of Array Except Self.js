// https://leetcode.com/problems/product-of-array-except-self/description/

var productExceptSelf = function(nums) {
    const size = nums.length;
    // calculate the left and the right sum
    const left =[];
    const right = [];

    // Calculate the left sum
    left.push(1);
    for(let index=1; index<size; index++)
        left.push(left[index-1] * nums[index-1]);

    // calculate the right sum
    right.push(1);
    for(let index = size-2; index>=0; index--)
        right.unshift(right[0] * nums[index+1]);

    // calculate the result 
    const result = [];
    for(let index=0; index<size; index++)
        result.push(left[index] * right[index]);

    return result;
};
