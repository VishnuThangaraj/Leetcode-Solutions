// https://leetcode.com/problems/max-consecutive-ones/description/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int oneCount = 0, result = 0;

        for(int index=0; index<nums.length; index++){
            if(nums[index] == 0){
                // update result
                result = Math.max(result, oneCount);
                oneCount = 0;
            }else
                oneCount++;
        }
        //System.gc(); // optional to free-up memory

        return Math.max(result, oneCount);
    }
}
