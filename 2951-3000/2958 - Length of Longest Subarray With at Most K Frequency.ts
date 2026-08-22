/*
2958. Length of Longest Subarray With at Most K Frequency
https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/description/

Solution
https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/solutions/8455771/longest-subarray-with-at-most-k-frequenc-gz5c/
*/

function maxSubarrayLength(nums: number[], k: number): number {
    let result: number = 0;
    let start: number = 0;

    const storage: Map<number, number> = new Map();

    for (let end = 0; end < nums.length; end++) {
        storage.set(nums[end], (storage.get(nums[end]) || 0) + 1);

        // Shrink window if frequency exceeds k
        while (storage.get(nums[end])! > k) {
            storage.set(nums[start], storage.get(nums[start])! - 1);
            start++;
        }

        result = Math.max(result, end - start + 1);
    }

    return result;
}
