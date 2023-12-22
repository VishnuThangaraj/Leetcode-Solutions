// https://leetcode.com/problems/first-bad-version/

var solution = function(isBadVersion) {
    /**
     * @param {integer} n Total versions
     * @return {integer} The first bad version
     */
    return function(n) {
        let first = 1, last = n;

        while(first <= last){
            let mid = first + Math.floor((last - first) / 2);

            if(isBadVersion(mid)){
                last = mid - 1;
            }else{
                first = mid + 1;
            }
        }

        return first;
    };
};
