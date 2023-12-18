// https://leetcode.com/problems/maximum-product-difference-between-two-pairs/

class Solution {
    public int maxProductDifference(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = max1;
        int min1 = Integer.MAX_VALUE, min2 = min1;

        // find the small and large values
        for(int num : nums){
            if(num > max1){
                max2 = max1;
                max1 = num;
            }else if(num > max2) max2 = num;

            if(num < min1){
                min2 = min1;
                min1 = num;
            }else if (num < min2) min2 = num;
        }

        return (max1*max2) - (min1*min2);
    }
}
