// https://leetcode.com/problems/arithmetic-slices-ii-subsequence/

// https://leetcode.com/problems/arithmetic-slices-ii-subsequence/solutions/4521112/o-n-2-java-python-javascript-dynamic-programming-hashmap/?envType=daily-question&envId=2024-01-07

var numberOfArithmeticSlices = function(nums) {
    const storage = new Map();
    const size = nums.length;
    const dp = Array.from(Array(size), () => Array(size).fill(0));

    let result = 0;
    for(let index=0; index<size; index++){
        if(!storage.has(nums[index])) storage.set(nums[index], []);
        storage.get(nums[index]).push(index);
    }

    for(let row=1; row<size; row++){
        for(let col=row+1; col<size; col++){
            const prev = 2 * nums[row] - nums[col];
            if(storage.has(prev) ){
                for(let k of storage.get(prev)){
                    if(k < row){
                        dp[row][col] += dp[k][row] + 1;
                    }else{
                        break;
                    }
                }
            }
            result += dp[row][col];
        }
    }

    return result;
};
