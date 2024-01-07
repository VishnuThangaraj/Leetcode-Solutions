// https://leetcode.com/problems/arithmetic-slices-ii-subsequence/

// https://leetcode.com/problems/arithmetic-slices-ii-subsequence/solutions/4521112/o-n-2-java-python-javascript-dynamic-programming-hashmap/?envType=daily-question&envId=2024-01-07

class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        HashMap<Long, List<Integer>> storage = new HashMap<>();
        int size = nums.length;
        int[][] dp = new int[size][size];

        int result = 0;
        for(int index=0; index<size; index++){
            long num = nums[index];
            storage.computeIfAbsent(num, k -> new ArrayList<>()).add(index);}

        for(int row=1; row<size; row++){
            for(int col=row+1; col<size; col++){
                long prev = 2L * nums[row] - nums[col];
                if (prev > Integer.MAX_VALUE || prev < Integer.MIN_VALUE)
                    continue;
                if(storage.containsKey(prev) ){
                    for(int k : storage.get(prev)){
                        if(k < row){
                            dp[row][col] += dp[k][row] + 1;
                        }else{
                            break;
                        }
                    }
                }
                result += dp[row][col];
            }
        }

        return result;
    }
}
