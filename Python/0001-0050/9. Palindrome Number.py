# https://leetcode.com/problems/palindrome-number/description/

class Solution:
    def isPalindrome(self, x: int) -> bool:
        reversedInt, copy = 0, x

        # reversing the given int to a copy variable
        while copy>0:
            # (%10) to get last digit of a number
            reversedInt = (reversedInt*10) + copy%10
            # after getting last digit remove the last digit by (/10)
            copy//=10
        
        # //if reversed and given number is same its palindrome
        return True if (x == reversedInt) else False
