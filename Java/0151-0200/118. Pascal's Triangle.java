// https://leetcode.com/problems/pascals-triangle/description/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> dummy = new ArrayList<>();
        dummy.add(1);
        result.add(dummy);

        for(int row = 0; row < numRows-1; row++){
            List<Integer> current = new ArrayList<>();
            current.add(1);

            for(int index=0; index<result.size()-1; index++){
                current.add(result.get(row).get(index)+result.get(row).get(index+1));
            }
            current.add(1);
            result.add(current);
        }

        return result;
    }
}
