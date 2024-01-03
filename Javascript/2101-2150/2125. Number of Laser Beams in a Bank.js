// https://leetcode.com/problems/number-of-laser-beams-in-a-bank/

// https://leetcode.com/problems/number-of-laser-beams-in-a-bank/solutions/4495310/on-java-python-javascript-linear-solution/

var numberOfBeams = function(bank) {
    let total = 0, previousLasers = 0;

        for (row of bank){
            current = row.split("1").length - 1;

            // continue if No lasers found in the current Row
            if (current == 0) continue;

            total += previousLasers * current
            previousLasers = current
        }
        
        return total;
};
