// https://leetcode.com/problems/median-of-two-sorted-arrays/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Apply BinarySearch in shorter Array for better time complexity
        int num1 = nums1.length, num2 = nums2.length;
        if(num1 > num2)
            return findMedianSortedArrays(nums2, nums1);

        int low = 0, high = nums1.length;
        int left = (num1 + num2 + 1) / 2;
        boolean oddSizeArray = ((num1 + num2) % 2 != 0) ? true : false;

        while(low <= high){
            int mid1 = (low + high) / 2, mid2 = left - mid1;

            int left1 = (mid1-1 >= 0) ? nums1[mid1-1] : Integer.MIN_VALUE;
            int left2 = (mid2-1 >= 0) ? nums2[mid2-1] : Integer.MIN_VALUE;
            int right1 = (mid1 < num1) ? nums1[mid1] : Integer.MAX_VALUE;
            int right2 = (mid2 < num2) ? nums2[mid2] : Integer.MAX_VALUE;

            if(left1 <= right2 && left2 <= right1){
                // return mid if odd size of array
                if(oddSizeArray) return (double) Math.max(left1, left2);
                // if even
                return (double) (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
            }
            else if(left1 > right2){
                high = mid1 - 1;
            }
            else{
                low = mid1 + 1;
            }
        }

        return 1.0; // Dummy return
    }
}
