# https://leetcode.com/problems/next-greater-element-ii/description/

class Solution:
    def nextGreaterElements(self, nums: List[int]) -> List[int]:
        size = len(nums)
        result = []

        # stack to store the index
        storage = []

        for index in reversed(range(0, (2*size)-1)):
            # remove elements less than current from the stack
            while(len(storage) != 0 and nums[storage[len(storage)-1]] <= nums[index % size]):
                storage.pop()

            if(index < size):
                if(len(storage) != 0):
                    result.insert(0, nums[storage[len(storage)-1]])
                else:
                    result.insert(0, -1) # empty stack
            

            # add the current index to stack
            storage.append(index%size)
        
        return result
    
