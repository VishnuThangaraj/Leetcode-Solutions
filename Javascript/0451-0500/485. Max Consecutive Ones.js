// https://leetcode.com/problems/max-consecutive-ones/description/

var findMaxConsecutiveOnes = function(nums) {
    let oneCount = 0, result = 0;

    for(let index=0; index<nums.length; index++){
        if(nums[index] == 0){
            // update result
            result = Math.max(result, oneCount);
            oneCount = 0;
        }else
            oneCount++;
    }

    return Math.max(result, oneCount);
};
