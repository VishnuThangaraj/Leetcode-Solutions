// https://leetcode.com/problems/sort-colors/

var sortColors = function(nums) {
    const count = [0,0,0];

    for(let num of nums) count[num]++; // Count the occurance of 0,1 & 2
    
    let index = 0;
    for(let value=0; value<3; value++)
        for(let occurance=0; occurance<count[value]; occurance++)
            nums[index++] = value;
};
