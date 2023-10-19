// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        // find the student with max candies
        int max = 0;
        for(int index=0; index<candies.length; index++)
            if(max < candies[index])
                max = candies[index];

        for(int index=0; index<candies.length; index++){
            if((extraCandies+candies[index]) >= max)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }
}
