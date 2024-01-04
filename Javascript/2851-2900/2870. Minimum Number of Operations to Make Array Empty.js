// https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/

// https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/solutions/4504314/o-n-java-python-javascript-hashmap-solution/

var minOperations = function(nums) {
    const storage = new Map();
    let result = 0;

    for(let num of nums)
        storage.set(num, (storage.get(num) || 0) + 1);

    for (const [_, current] of storage) {
        if(current == 1) return -1;

        result += Math.floor(current / 3);
        if(current %3 != 0) result++;   
    }

    return result;
};
