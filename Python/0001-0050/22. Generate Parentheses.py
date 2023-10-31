# https://leetcode.com/problems/generate-parentheses/description/

class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        def generateRecursively(opening, closing, current):
            if len(current) == n*2:
                result.append(current)
                return

            # Recursive calls
            if opening < n:
                generateRecursively(opening+1, closing, current+"(")
            
            if closing < opening:
                generateRecursively(opening, closing+1, current+")")
            
        result = []
        generateRecursively(0,0,"")
        return result
