// https://leetcode.com/problems/shuffle-the-array/

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int startIndex = 0, midIndex =n, index = 0;
        int[] result = new int[nums.length];

        while(index < nums.length){
            result[index++] = nums[startIndex++];
            result[index++] = nums[midIndex++];
        }

        return result;
    }
}
