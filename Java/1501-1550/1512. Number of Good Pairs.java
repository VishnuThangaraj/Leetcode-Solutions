// https://leetcode.com/problems/number-of-good-pairs/

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> storage = new HashMap<>();

        for(int num : nums){
            result += storage.getOrDefault(num,0);
            storage.put(num, storage.getOrDefault(num, 0)+1);
        }

        return result;
    }
}
