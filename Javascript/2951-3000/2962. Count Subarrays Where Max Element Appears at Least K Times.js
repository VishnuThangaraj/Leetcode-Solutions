// https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times/

var countSubarrays = function(nums, k) {
    
    let maxNum = Math.max(...nums); // Get the num with maximum count
    let left = 0, right = 0, size = nums.length;

    let result = 0;

    while(right < size){
        k -= (nums[right++] == maxNum) ? 1 : 0;

        while(k == 0)
            k += (nums[left++] == maxNum) ? 1 : 0;

        result += left;
    }

    return result;
};
