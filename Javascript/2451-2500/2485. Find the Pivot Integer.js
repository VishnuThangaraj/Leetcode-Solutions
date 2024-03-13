// https://leetcode.com/problems/find-the-pivot-integer/

var pivotInteger = function(n) {
    const sum = Math.floor(n*(n+1) /2); // Total Sum till N
    let start = 1, end = n; // Binary Search Method

    while(start <= end){
        let mid = start + Math.floor((end-start)/2);

        let firstHalf = Math.floor(mid*(mid+1) /2);
        let secondHalf = (sum - firstHalf) + mid; // Including the mid

        if(firstHalf == secondHalf) return mid;
        else if(firstHalf > secondHalf) end = mid-1;
        else start = mid+1;

    }
    return -1; // Pivot Not found
};
