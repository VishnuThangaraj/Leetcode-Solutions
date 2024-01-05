// https://leetcode.com/problems/longest-increasing-subsequence/

// https://leetcode.com/problems/longest-increasing-subsequence/solutions/4510216/o-n-logn-java-python-javascript-dynamic-programming-binary-search/

class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] tail = new int[nums.length];
        int maxSize = 0; // longest subsequence

        for(int num : nums){
            int start = 0, end = maxSize;

            while(start != end){ // Binary Search
                int mid = (start + end) / 2;
                if(tail[mid] < num) start = mid +1;
                else end = mid;
            }

            tail[start] = num;
            maxSize = (start == maxSize) ? maxSize+1 : maxSize;
        }

        return maxSize;
    }
}
