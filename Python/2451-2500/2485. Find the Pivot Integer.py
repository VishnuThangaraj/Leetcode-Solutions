# https://leetcode.com/problems/find-the-pivot-integer/

class Solution:
    def pivotInteger(self, n: int) -> int:
        sum = n*(n+1) //2 # Total Sum till N
        start, end = 1, n # Binary Search Method

        while start <= end:
            mid = start + (end-start)//2;

            firstHalf = mid*(mid+1) //2
            secondHalf = (sum - firstHalf) + mid # Including the mid

            if firstHalf == secondHalf:
                return mid
            elif firstHalf > secondHalf:
                end = mid-1
            else:
                start = mid+1
        
        return -1 # Pivot Not found
