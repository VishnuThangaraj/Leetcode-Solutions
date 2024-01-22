// https://leetcode.com/problems/set-mismatch/

// https://leetcode.com/problems/set-mismatch/solutions/4606322/on-on-java-python-javascript-typescript-c-c-frequency-calculation/

var findErrorNums = function(nums) {
    let repeat = -1, missing = -1;
    const storage = new Array((nums.length)+1).fill(0);

    for(let num of nums)
        storage[num]++; // store the frequency

    for(let index=1; index<storage.length; index++)
        if(storage[index] == 0) missing = index; // missing element
        else if(storage[index]>1) repeat = index; // repeated element

    return [repeat,missing];
};
