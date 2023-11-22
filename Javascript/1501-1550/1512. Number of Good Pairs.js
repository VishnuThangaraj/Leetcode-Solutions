// https://leetcode.com/problems/number-of-good-pairs/

var numIdenticalPairs = function(nums) {
    let result = 0;
    const storage = new Map();

    for(let num of nums){
        if(storage.has(num)){
            result += storage.get(num);
            storage.set(num, storage.get(num)+1);
        }
        else{
            storage.set(num, 1);
        }
    }

    return result;
};
