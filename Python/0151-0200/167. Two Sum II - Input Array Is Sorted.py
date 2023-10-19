# https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/?envType=study-plan-v2&envId=top-interview-150

class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        # Two-Pointers
        first, second = 0, len(numbers)- 1
        while first < second:
            if numbers[first] + numbers[second] == target: # target found
                return [first+1, second+1]
            elif numbers[first] + numbers[second] < target:
                first += 1
            else:
                second -= 1
                
        return None
  
