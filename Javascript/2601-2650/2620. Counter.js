// https://leetcode.com/problems/counter/description/?envType=study-plan-v2&envId=30-days-of-javascript

var createCounter = function(n) {
    let count = n;
    return function() {
        return count++;
    };
};
