# https://leetcode.com/problems/assign-cookies/

class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        g.sort()
        s.sort()

        kid, cookie, satisfied = 0, 0, 0
        
        while kid < len(g) and cookie <len(s):
            if g[kid] <= s[cookie]:
                satisfied += 1
                kid +=1
            
            cookie += 1

        return satisfied
