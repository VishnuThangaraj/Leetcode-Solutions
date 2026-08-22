/*
2996. Smallest Missing Integer Greater Than Sequential Prefix Sum
https://leetcode.com/problems/smallest-missing-integer-greater-than-sequential-prefix-sum/

Solution
https://leetcode.com/problems/smallest-missing-integer-greater-than-sequential-prefix-sum/solutions/8453571/missing-integer-using-prefix-sum-and-has-iwlr
*/

function missingInteger(nums: number[]): number {
    let prefixSum: number = nums[0];
    const length: number = nums.length;
    const storage: Set<number> = new Set(nums);

    let index: number = 1;

    // Find the sum of the longest consecutive prefix
    while (
        index < length &&
        nums[index] === nums[index - 1] + 1
    ) {
        prefixSum += nums[index];
        index++;
    }

    // Find the smallest missing integer
    while (storage.has(prefixSum)) {
        prefixSum++;
    }

    return prefixSum;
}
