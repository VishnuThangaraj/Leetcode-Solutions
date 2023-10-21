// https://leetcode.com/problems/maximum-subarray/description/

class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0; // subarray Sum

        for(int num : nums){
            sum += num; // ADD CURRENT ELEMENT TO SUBARRAY SUM
            max = Math.max(max, sum); // update the result
            // check if sum goes below 0
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}
