// https://leetcode.com/problems/boats-to-save-people/

var numRescueBoats = function(people, limit) {
    people.sort((a, b) => a - b);

    let first = 0, second = people.length-1, result = 0;

    while(first <= second){
        let weight = people[first] + people[second];
        
        first += (weight <= limit) ? 1 : 0;
        second--; result++;
    }

    return result;
};
