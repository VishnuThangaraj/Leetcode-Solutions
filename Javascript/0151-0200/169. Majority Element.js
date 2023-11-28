// https://leetcode.com/problems/majority-element/description/

var findMajor = function(nums, startIndex, reference){
    let numCount = 0;

    for(let index=startIndex; index<nums.length; index++){
        if(nums[index] == reference)
            numCount ++;
        else
            numCount --;

        // Check if the reference is major or not
        if(numCount < 0) return findMajor(nums, index, nums[index]);
    }

    return reference;
};

var majorityElement = function(nums) {
    // array, startIndex, reference
    return findMajor(nums,0,nums[0]);
};
