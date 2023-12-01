// https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int pairs = 0;
        int size = nums.size();

        for(int first =0; first < size; first++){
            for(int second = first+1; second < size ; second++){
                if(nums.get(first) + nums.get(second) < target)
                    pairs++;
            }
        }

        return pairs;
    }
}
