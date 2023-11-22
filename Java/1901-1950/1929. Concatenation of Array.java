// https://leetcode.com/problems/concatenation-of-array/

class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] result = new int[size*2];

        for(int index=0; index<size; index++){
            result[index] = nums[index];
            result[index+size] = nums[index];
        }

        return result;
    }
}
