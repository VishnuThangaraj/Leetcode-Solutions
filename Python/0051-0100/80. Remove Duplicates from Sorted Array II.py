# https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        first = 1 # Two Pointers

        for second in range(1,len(nums)):
            if(first == 1 or nums[second] != nums[first-2]):
                nums[first] = nums[second]
                first += 1

        return first
