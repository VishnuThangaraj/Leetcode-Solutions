// https://leetcode.com/problems/find-the-pivot-integer/

class Solution {
    public int pivotInteger(int n) {
        int sum = n*(n+1)/2; // Total Sum till N
        int start = 1, end = n; // Binary Search Method

        while(start <= end){
            int mid = start + (end-start)/2;

            int firstHalf = mid*(mid+1)/2;
            int secondHalf = (sum - firstHalf) + mid; // Including the mid

            if(firstHalf == secondHalf) return mid;
            else if(firstHalf > secondHalf) end = mid-1;
            else start = mid+1;
        }

        return -1; // Pivot Not found
    }
}
