# https://leetcode.com/problems/two-sum/description/

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # store all value and index in Dictionary
        storage = {}

        result = [-1,-1]
        # iterate the array to find the result 
        for index in range(0, len(nums)):
            if (target - nums[index]) in storage:
                result[0] = index
                result[1] = storage[target - nums[index]]
            
            # add the value to Dictionary
            storage[nums[index]] = index

        return result;
      
