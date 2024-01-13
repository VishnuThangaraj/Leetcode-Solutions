# https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/

# https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/solutions/4555665/o-n-java-python-javascript-typescript-c-c-character-count/

class Solution:
    def minSteps(self, s: str, t: str) -> int:
        alphabets = [0] * 26
        result = 0

        # storing difference of frequency of characters in both string
        for index in range(0,len(s)):
            alphabets[ord(t[index]) - ord('a')] += 1
            alphabets[ord(s[index]) - ord('a')] -= 1

        for count in alphabets:
            result += max(0, count)

        return result

