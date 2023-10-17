// https://leetcode.com/problems/next-greater-element-ii/description/

var nextGreaterElements = function(nums) {
    size = nums.length;
    result = [];

    // stack to store the index
    storage = [];

    for(let index = (2*size)-1; index>=0; index--){
        // remove elements less than current from the stack
        while(storage.length != 0 && nums[storage[storage.length-1]] <= nums[index % size])
            storage.pop();

        if(index < size){
            if(storage.length != 0)
                result.unshift(nums[storage[storage.length-1]]);
            else
                result.unshift(-1); // empty stack
        }

        // add the current index to stack
        storage.push(index%size);
    }
    return result;
};
