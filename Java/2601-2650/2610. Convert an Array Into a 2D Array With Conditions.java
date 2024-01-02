// https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/

// https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/solutions/4490403/o-n-java-python-javascript-linear-solution/

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {

        int[] frequency = new int[nums.length+1];
        ArrayList<List<Integer>> result = new ArrayList<>();

        for(int num : nums){
            if(frequency[num] >= result.size()) // Create new Row
                result.add(new ArrayList<>());
            
            result.get(frequency[num]++).add(num);
        }

        return result;
    }
}
