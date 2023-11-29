# https://leetcode.com/problems/find-words-containing-character/

class Solution:
    def findWordsContaining(self, words: List[str], x: str) -> List[int]:
        result = []

        for index in range(0, len(words)):
            if x in words[index]:
                result.append(index);

        return result
        
