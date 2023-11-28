# https://leetcode.com/problems/plus-one/

class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        size = len(digits)
        rem = 1

        for index in reversed(range(0,size)):
            if rem == 1:
                digits[index] += 1
                rem = 0 if (digits[index] <= 9) else 1
                digits[index] = digits[index] % 10

        if rem == 1:
            digits.insert(0, 1)
        
        return digits
