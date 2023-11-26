# https://leetcode.com/problems/valid-palindrome/

class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.lower()
        # remove non-alphabet characters
        palindrome = ""

        for letter in s:
            if((letter >= 'a' and letter <= 'z') or (letter >= '0' and letter <= '9')):
                palindrome += letter

        # Two-Pointers
        first, second = 0, len(palindrome)-1

        while first <= second:
            if palindrome[first] != palindrome[second]:
                return False
            first += 1
            second -= 1

        return True # Its a palindrome
