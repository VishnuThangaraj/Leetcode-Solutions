# https://leetcode.com/problems/arithmetic-slices-ii-subsequence/

# https://leetcode.com/problems/arithmetic-slices-ii-subsequence/solutions/4521112/o-n-2-java-python-javascript-dynamic-programming-hashmap/?envType=daily-question&envId=2024-01-07

class Solution:
    def numberOfArithmeticSlices(self, nums):
        storage = {}
        size = len(nums)
        dp = [[0] * size for _ in range(size)]

        for index in range(size):
            if nums[index] not in storage:
                storage[nums[index]] = []
            storage[nums[index]].append(index)

        result = 0
        for row in range(1, size):
            for col in range(row + 1, size):
                prev = 2 * nums[row] - nums[col]
                if prev in storage:
                    for k in storage[prev]:
                        if k < row:
                            dp[row][col] += dp[k][row] + 1
                        else:
                            break
                result += dp[row][col]

        return result
