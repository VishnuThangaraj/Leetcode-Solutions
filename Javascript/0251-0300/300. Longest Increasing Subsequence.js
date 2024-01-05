// https://leetcode.com/problems/longest-increasing-subsequence/

// https://leetcode.com/problems/longest-increasing-subsequence/solutions/4510216/o-n-logn-java-python-javascript-dynamic-programming-binary-search/

var lengthOfLIS = function(nums) {
    const tail = new Array(nums.length).fill(0);
    let maxSize = 0; // longest subsequence

    for(let num of nums){
        let start = 0, end = maxSize;

        while(start != end){ // Binary Search
            const mid = Math.floor((start + end) / 2);
            if(tail[mid] < num) start = mid +1;
            else end = mid;
        }

        tail[start] = num;
        maxSize = (start == maxSize) ? maxSize+1 : maxSize;
    }

    return maxSize;
};
