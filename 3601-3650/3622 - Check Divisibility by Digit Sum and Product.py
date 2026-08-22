'''
3622. Check Divisibility by Digit Sum and Product
https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/
'''

class Solution:
    def checkDivisibility(self, n: int) -> bool:
        sum, product = 0, 1
        temp_n = n

        # calculate sum and product
        while temp_n > 0:
            last_digit = temp_n  % 10
            sum += last_digit
            product *= last_digit

            temp_n //= 10

        return n % (sum+product) == 0
