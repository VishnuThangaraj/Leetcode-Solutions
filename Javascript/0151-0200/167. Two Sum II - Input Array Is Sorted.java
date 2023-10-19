// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/?envType=study-plan-v2&envId=top-interview-150

var twoSum = function(numbers, target) {
    // Two-Pointers
    let first = 0, second = numbers.length - 1;
    while (first < second) {
        if(numbers[first] + numbers[second] == target) // target found
            return [first+1, second+1];
        else if(numbers[first] + numbers[second] < target)
            first++;
        else
            second--;
    }
    return null;
};
