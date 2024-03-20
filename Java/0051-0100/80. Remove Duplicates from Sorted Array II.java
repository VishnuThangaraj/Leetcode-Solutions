// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

class Solution {
    public int removeDuplicates(int[] nums) {
        int first = 1, second = 1; // Two Pointers

        for(;second<nums.length; second++)
            if(first == 1 || nums[second] != nums[first-2])
                nums[first++] = nums[second];

        return first;
    }
}
