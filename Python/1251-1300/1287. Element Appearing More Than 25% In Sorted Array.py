# https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/

class Solution:
    def findSpecialInteger(self, arr: List[int]) -> int:
        size = len(arr)
        qtr, count = size // 4, 1

        result = arr[0]

        for index in range (1, size):
            # Update count
            if result == arr[index]:
                count += 1
            else:
                count = 1

            if(count > qtr):
                return result

            result = arr[index]
        
        return result
