# https://leetcode.com/problems/first-bad-version/

class Solution:
    def firstBadVersion(self, n: int) -> int:
        first, last = 1, n

        while(first <= last):
            mid = first + (last - first) // 2

            if isBadVersion(mid):
                last = mid - 1
            else:
                first = mid + 1

        return first
