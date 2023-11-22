# https://leetcode.com/problems/number-of-good-pairs/

class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        result = 0
        storage = {}

        for num in nums:
            if num in storage:
                result += storage[num]
                storage[num] += 1
            else:
                storage[num] = 1

        return result
        
