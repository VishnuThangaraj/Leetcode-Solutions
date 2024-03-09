// https://leetcode.com/problems/minimum-common-value/description/

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int first = 0, second = 0; // Two-Pointer

        while(first < nums1.length && second < nums2.length){
            if(nums1[first] == nums2[second])
                return nums1[first]; // common value
            else if(nums1[first] < nums2[second])
                first++;
            else
                second++;
        }

        return -1; // No Common value found
    }
}
