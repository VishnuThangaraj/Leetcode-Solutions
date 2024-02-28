# https://leetcode.com/problems/reverse-string/

class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        start, end = 0, len(s)-1 # Two-Pointers
        temp = ' ' # Temporary Variable 

        while start < end: # Swap the characters in start and end pointers
            temp = s[start]
            s[start] = s[end]
            s[end] = temp
            start += 1
            end -= 1
