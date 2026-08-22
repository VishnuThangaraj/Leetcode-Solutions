'''
3090. Maximum Length Substring With Two Occurrences
https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/description/

Solution
https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/solutions/8459709/maximum-length-substring-with-at-most-tw-xtft/
'''

class Solution:
    def maximumLengthSubstring(self, s: str) -> int:
        result = 0
        start = 0

        storage = {}

        for end in range(len(s)):
            storage[s[end]] = storage.get(s[end], 0) + 1

            # Shrink window if frequency exceeds 2
            while storage[s[end]] > 2:
                storage[s[start]] -= 1
                start += 1

            result = max(result, end - start + 1)

        return result
