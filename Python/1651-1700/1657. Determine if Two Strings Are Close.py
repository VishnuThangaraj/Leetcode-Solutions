# https://leetcode.com/problems/determine-if-two-strings-are-close/

# https://leetcode.com/problems/determine-if-two-strings-are-close/solutions/4561511/o-nlogn-java-python-javascript-typescript-c-c-character-count/

class Solution:
    def closeStrings(self, word1: str, word2: str) -> bool:
        if len(word1) != len(word2):
            return False
        
        frequency1 = [0] * 26
        frequency2 = [0] * 26

        for letter in word1:
            frequency1[ord(letter)- ord('a')] += 1

        for letter in word2:
            frequency2[ord(letter)- ord('a')] += 1

        for index in range (0,26):
            if frequency1[index] == 0 and frequency2[index] != 0:
                return False
            if frequency1[index] != 0 and frequency2[index] == 0:
                return False

        return sorted(frequency1) == sorted(frequency2)
