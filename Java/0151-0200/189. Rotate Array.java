// https://leetcode.com/problems/rotate-array/

class Solution {
    // Function to reverse elements in the Array
    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;end--;
        }
    }

    public void rotate(int[] nums, int k) {
        int size = nums.length;
        k %= size; // ensure k is in the range

        reverse(nums, 0, size-1); // Revere Entire Array
        reverse(nums, 0 , k-1); // Rrverse K elements
        reverse(nums, k, size-1); // Reverse remaining elements
    }
}
