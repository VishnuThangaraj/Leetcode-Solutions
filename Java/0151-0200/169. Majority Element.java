// https://leetcode.com/problems/majority-element/description/

// METHOD - 1 (SORTING)
  Arrays.sort(nums);
  return nums[nums.length/2];

// METHOD - 2

class Solution {
    public int findMajor (int[] nums, int startIndex, int reference) {
        int numCount = 0;

        for(int index=startIndex; index<nums.length; index++){
            if(nums[index] == reference)
                numCount ++;
            else
                numCount --;

            // Check if the reference is major or not
            if(numCount < 0) return findMajor(nums, index, nums[index]);
        }

        return reference;
    }

    public int majorityElement(int[] nums) {
        // array, startIndex, reference
        return findMajor(nums,0,nums[0]);
    }
}
