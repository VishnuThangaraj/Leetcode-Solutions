// https://leetcode.com/problems/boats-to-save-people/

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int first = 0, second = people.length-1, result = 0;

        while(first <= second){
            int weight = people[first] + people[second];
            
            first += (weight <= limit) ? 1 : 0;
            second--; result++;
        }

        return result;
    }
}
