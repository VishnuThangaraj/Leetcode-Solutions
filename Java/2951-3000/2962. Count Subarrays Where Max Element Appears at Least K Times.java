// https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times/

public long countSubarrays(int[] nums, int k) {
        // Get the num with maximum count
        int maxNum = Arrays.stream(nums).max().getAsInt();
        int left = 0, right = 0, size = nums.length;

        long result = 0;

        while(right < size){
            k -= (nums[right++] == maxNum) ? 1 : 0;

            while(k == 0)
                k += (nums[left++] == maxNum) ? 1 : 0;

            result += left;
        }

        return result;
    }
