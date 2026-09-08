'''
3870. Count Commas in Range
https://leetcode.com/problems/count-commas-in-range/description/

'''

class Solution:
    def countCommas(self, n: int) -> int:
        return 0 if len(str(n)) < 4 else n - 999
