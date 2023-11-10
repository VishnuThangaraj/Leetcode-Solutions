# https://leetcode.com/problems/contains-duplicate/description/

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        # sort the array and find the duplicate or use Set for reducing time complexity
        storage = {""}

        for num in nums:
            # check if set contains the num
            if num in storage:
                return True # duplicate found
            storage.add(num)
        
        return False # No duplcicates found
