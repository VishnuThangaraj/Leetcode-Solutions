# https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/

class Solution:
    def minOperations(self, s: str) -> int:
        binary = True
        zero, one = 0, 0

        for letter in s:
            if binary :
                if letter == '0':
                    one += 1
                else:
                    zero += 1
            else:
                if letter == '0':
                    zero += 1
                else:
                    one += 1
            binary = not binary

        return min(one, zero)
