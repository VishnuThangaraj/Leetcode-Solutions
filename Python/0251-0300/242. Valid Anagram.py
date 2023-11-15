# https://leetcode.com/problems/valid-anagram/description/

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # strings of different size cant be a valid anagram
        if len(s) != len(t):
            return False

        # create Dictitionary to store the character and its occcurance
        first = {}
        second = {}

        # add the first string to Dictitionary
        for index in range(0, len(s)):
            # get the character at particular index
            letter = s[index];
            # check if the alphabet already exists in Dictitionary
            if letter in first:
                #update the count
                first[letter] = first[letter] + 1
                continue
            # does not exists in Dictitionary
            first[letter] = 1
        
        # add the second string to Dictitionary
        for index in range(0, len(t)):
            # get the character at particular index
            letter = t[index];
            # check if the alphabet already exists in Dictitionary
            if letter in second:
                #update the count
                second[letter] = second[letter] + 1
                continue
            # does not exists in Dictitionary
            second[letter] = 1

        # iterate the second string to check all the character occured same number of times
        for key,value in first.items():
            if key in second:
                if value != second[key]:
                    return False
            else:
                return False # nota a valid anagram

        return True # valid anagram
