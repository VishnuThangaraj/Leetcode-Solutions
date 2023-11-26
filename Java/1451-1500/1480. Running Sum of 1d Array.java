// https://leetcode.com/problems/running-sum-of-1d-array/

class Solution {
    public int[] runningSum(int[] nums) {
        int prefix = nums[0];

        for(int index=1; index<nums.length; index++){
            prefix = nums[index] + prefix;
            nums[index] = prefix;
        }

        return nums;
    }
}
