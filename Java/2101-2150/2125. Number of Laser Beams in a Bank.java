// https://leetcode.com/problems/number-of-laser-beams-in-a-bank/

// https://leetcode.com/problems/number-of-laser-beams-in-a-bank/solutions/4495310/on-java-python-javascript-linear-solution/

class Solution {
    public int numberOfBeams(String[] bank) {
        int total = 0, previousLasers = 0;

        for(String row : bank){
            int current = 0; // Calculate number of '1' in current Row
            for(char cell : row.toCharArray())
                current += cell - '0';

            // continue if No lasers found in the current Row
            if(current == 0) continue; 

            total += previousLasers * current;
            previousLasers = current;
        }

        return total;
    }
}
