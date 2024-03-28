// https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {

        HashMap<Integer, Integer> storage = new HashMap<>();
        int size = nums.length, result = 0;

        int left = 0;
        for(int right=0; right<size; right++){

            storage.put(nums[right], storage.getOrDefault(nums[right],0)+1);

            while( storage.get(nums[right]) > k )
                storage.put(nums[left], storage.get(nums[left++])-1);

            result = Math.max(result, right-left+1);
        }

        return result;
    }
}
