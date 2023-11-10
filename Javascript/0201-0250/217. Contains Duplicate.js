// https://leetcode.com/problems/contains-duplicate/description/

var containsDuplicate = function(nums) {
    //u can sort the array and find the duplicates or use set to reduce time complexity
        let storage = new Set();

        //traverse through the given array
        for(let index=0; index<nums.length; index++){
            if(storage.has(nums[index])){
                return true; //duplicates found
            }
            //add the element to the hashSet
            storage.add(nums[index]);
        }

        return false; //no duplicates found
};
