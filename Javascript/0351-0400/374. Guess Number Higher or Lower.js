// https://leetcode.com/problems/guess-number-higher-or-lower/

var guessNumber = function(n) {
    let start = 1;
    let end = n;
    while(start<=end) {
        let mid = start + Math.floor((end-start) /2);
        if(guess(mid) == 0)
            return mid;
        else if(guess(mid) == 1)
            start = mid + 1;
        else
            end = mid - 1;
    }
    return -1;
};
