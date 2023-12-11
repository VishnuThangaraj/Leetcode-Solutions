// https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/

class Solution {
    public int findSpecialInteger(int[] arr) {
        
        int size = arr.length;
        int qtr = size / 4, count = 1;

        int result = arr[0];

        for(int index=1; index < size; index++){
            // Update count
            if(result == arr[index]) count++;
            else count = 1;

            if(count > qtr) return result;

            result = arr[index];
        }
        
        return result;
    }
}
