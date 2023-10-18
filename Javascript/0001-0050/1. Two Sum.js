// https://leetcode.com/problems/two-sum/description/

var twoSum = function(nums, target) {
    //store all value and index in HashMap
    storage = new Map();

    result = [-1,-1];
    //iterate the array to find the result 
    for(let index=0; index<nums.length; index++){
        if(storage.has( target - nums[index])){
            result[0] = index;
            result[1] = storage.get(target - nums[index]);
        }
        //add the value to hashMap
        storage.set(nums[index],index);
    }

    return result;
};
