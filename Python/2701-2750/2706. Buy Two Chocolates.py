# https://leetcode.com/problems/buy-two-chocolates/

class Solution:
    def buyChoco(self, prices: List[int], money: int) -> int:
        min1, min2 = 99999, 99999

        for price in prices:
            if price < min1:
                min2 = min1
                min1=price
            elif price < min2:
                min2 = price
        
        cost = min1 + min2

        if(cost <= money):
            return money - cost
        
        return money
