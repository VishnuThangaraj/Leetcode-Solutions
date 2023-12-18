// https://leetcode.com/problems/maximum-product-difference-between-two-pairs/

var maxProductDifference = function(nums) {
    let max1 = Number.MIN_SAFE_INTEGER, max2 = max1;
    let min1 = Number.MAX_SAFE_INTEGER, min2 = min1;

    // find the small and large values
    for(let num of nums){
        if(num > max1){
            max2 = max1;
            max1 = num;
        }else if(num > max2) max2 = num;

        if(num < min1){
            min2 = min1;
            min1 = num;
        }else if (num < min2) min2 = num;
    }

    return (max1*max2) - (min1*min2);
};
