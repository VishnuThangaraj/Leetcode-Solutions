# https://leetcode.com/problems/set-mismatch/

# https://leetcode.com/problems/set-mismatch/solutions/4606322/on-on-java-python-javascript-typescript-c-c-frequency-calculation/

class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        repeat, missing = -1, -1
        storage = [0] * (len(nums)+1)

        for num in nums:
            storage[num] += 1 # store the frequency

        for index in range(1, len(storage)):
            if storage[index] == 0:
                missing = index # missing element
            elif storage[index]>1:
                repeat = index # repeated element

        return [repeat,missing]
