class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        Arrays.sort(expected);

        int difference  = 0;

        for(int index=0; index<heights.length; index++)
            if(heights[index] != expected[index]) difference++;

        return difference;
    }
}
