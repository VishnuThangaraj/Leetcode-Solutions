// https://leetcode.com/problems/product-of-array-except-self/description/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        // calculate the left and the right sum
        int[] left = new int[size];
        int[] right = new int[size];

        // Calculate the left sum
        left[0] = 1;
        for(int index=1; index<size; index++)
            left[index] = left[index-1] * nums[index-1];

        // calculate the right sum
        right[size-1] = 1;
        for(int index = size-2; index>=0; index--)
            right[index] = right[index+1] * nums[index+1];

        // calculate the result 
        int[] result = new int[size];
        for(int index=0; index<size; index++)
            result[index] = left[index] * right[index];

        return result;
    }
}
