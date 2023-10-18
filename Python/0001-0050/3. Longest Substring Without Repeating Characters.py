# https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        # use two pointer approach
        start  = 0 
        end = 0
        maxy = 0

        # HashSet to store unique characters
        storage = {"?/?/"}
        length = 0 # length of current substring

        while end < len(s):
            letter = s[end]
            while letter in storage:
                storage.remove(s[start])
                length -= 1
                start += 1
            

            if letter in storage:
                continue
            else:
                # add to HashSet
                storage.add(letter)
                end += 1
                length += 1
                maxy = max(maxy , length)
            
        
        return maxy
        
