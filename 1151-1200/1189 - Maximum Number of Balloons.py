'''
1189. Maximum Number of Balloons
https://leetcode.com/problems/maximum-number-of-balloons/description/

Solution 
https://leetcode.com/problems/maximum-number-of-balloons/solutions/8351784/on-o1-java-python-javascript-typescript-sgt4a/
'''

class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        # Store required character counts
        freq = {'b': 0, 'a': 0, 'l': 0, 'o': 0, 'n': 0}

        # Count occurrences
        for letter in text:
            if letter in freq:
                freq[letter] += 1

        result = len(text)

        # Find limiting character
        for key, value in freq.items():
            if key == 'l' or key == 'o':
                value //= 2  # Needed twice

            result = min(result, value)

        return result