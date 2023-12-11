// https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/

var findSpecialInteger = function(arr) {
    const size = arr.length;
    let qtr = size / 4, count = 1;

    let result = arr[0];

    for(let index=1; index < size; index++){
        // Update count
        if(result == arr[index]) count++;
        else count = 1;

        if(count > qtr) return result;

        result = arr[index];
    }
    
    return result;
};
