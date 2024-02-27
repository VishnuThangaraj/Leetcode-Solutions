// https://leetcode.com/problems/sort-colors/

class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3];

        for(int num : nums) count[num]++; // Count the occurance of 0,1 & 2
        
        int index = 0;
        for(int value=0; value<3; value++)
            for(int occurance=0; occurance<count[value]; occurance++)
                nums[index++] = value;
    }
}
