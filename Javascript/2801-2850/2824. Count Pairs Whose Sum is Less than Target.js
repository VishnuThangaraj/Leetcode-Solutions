// https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/

var countPairs = function(nums, target) {
    let pairs = 0;
    const size = nums.length;

    for(let first =0; first < size; first++){
        for(let second = first+1; second < size ; second++){
            if(nums[first] + nums[second] < target)
                pairs++;
        }
    }

    return pairs;
};
