// https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/

// https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/solutions/4490403/o-n-java-python-javascript-linear-solution/

var findMatrix = function(nums) {
    const frequency = [];
    //populate the frequency array
    for(let index=0; index<=nums.length+1; index++)
        frequency.push(0);
    const result = [];

    for(let num of nums){
        if(frequency[num] >= result.length) // Create new Row
            result.push([]);
        
        result[frequency[num]++].push(num);
    }

    return result;
};
