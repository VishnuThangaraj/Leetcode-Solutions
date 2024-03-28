// https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/

var maxSubarrayLength = function(nums, k) {
    let storage = new Map();
    let size = nums.length, result = 0;

    let left = 0;
    for(let right=0; right<size; right++){

        storage.set(nums[right], 
            (storage.has(nums[right])) ? storage.get(nums[right])+1 : 1);

        while( storage.get(nums[right]) > k )
            storage.set(nums[left], storage.get(nums[left++])-1);

        result = Math.max(result, right-left+1);
    }

    return result;
};
