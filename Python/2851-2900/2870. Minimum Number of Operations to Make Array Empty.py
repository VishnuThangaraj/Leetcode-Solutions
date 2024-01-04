# https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/

# https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/solutions/4504314/o-n-java-python-javascript-hashmap-solution/

class Solution:
    def minOperations(self, nums: List[int]) -> int:
        storage = {}
        result = 0

        for num in nums:
            if num in storage:
                storage[num] += 1
            else:
                storage[num] = 1

        for current in storage.values():
            if current == 1:
                return -1

            result += current // 3
            if current %3 != 0:
                result += 1

        return result
