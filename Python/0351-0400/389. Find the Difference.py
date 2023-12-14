#  https://leetcode.com/problems/find-the-difference/

class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        result = 0

        for letter in s: result ^= ord(letter) #ord is ASCII value
        for letter in t: result ^= ord(letter)

        return chr(result) #convert ASCII into character
