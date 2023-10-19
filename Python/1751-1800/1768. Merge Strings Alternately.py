# https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75

class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        result = ""

        length  = len(word1) if len(word1) > len(word2) else len(word2)

        for index in range(0,length):
            # addend to result if its in the range
            if index < len(word1):
                result += word1[index]
            if index < len(word2):
                result += word2[index]

        return result
 
