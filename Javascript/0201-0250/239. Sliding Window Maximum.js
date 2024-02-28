// https://leetcode.com/problems/sliding-window-maximum/

var maxSlidingWindow = function(nums, k) {
    const size = nums.length;
    let result = [];
    const storage = [];

    // Add K length elements to Dequeue
    for(let index=0; index<k; index++){
        while(storage.length > 0 && nums[index] >= nums[storage[storage.length-1]])
            storage.pop();
        storage.push(index);
    }

    // Sliding Window
    for(let index=k; index<size; index++){
        result.push(nums[storage[0]]);

        // Remove Elements out of the window range
        while(storage.length > 0 && storage[0] < index-k+1)
            storage.shift();

        // Remove Smaller Elements than the current num form the End of Deque
        while(storage.length > 0 && nums[index] >= nums[storage[storage.length-1]])
            storage.pop();
        
        storage.push(index);
    }

    result.push(nums[storage[0]]);
    return result;
};
