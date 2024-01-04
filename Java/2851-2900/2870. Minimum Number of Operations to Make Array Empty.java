// https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/

// https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/solutions/4504314/o-n-java-python-javascript-hashmap-solution/

class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> storage = new HashMap<>();
        int result = 0;

        for(int num : nums)
            storage.put(num, storage.getOrDefault(num,0)+1);

        for(int key : storage.keySet()){
            int current = storage.get(key);
            if(current == 1) return -1;

            result += current / 3;
            if(current %3 != 0) result++;   
        }

        return result;
    }
}
