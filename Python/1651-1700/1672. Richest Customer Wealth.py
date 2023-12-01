# https://leetcode.com/problems/richest-customer-wealth/

class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        Rich = 0

        for row in range(0, len(accounts)):
            current = 0
            for col in range(0, len(accounts[0])):
                current += accounts[row][col]

            Rich = current if (Rich < current) else Rich
        
        return Rich
