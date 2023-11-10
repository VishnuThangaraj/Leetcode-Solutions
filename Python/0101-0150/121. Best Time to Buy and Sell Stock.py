# https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy, sell, maxProfit = 0, 0, 0

        while sell < len(prices) :
            if prices[sell] > prices[buy]:
                # update the max profit
                maxProfit = max(maxProfit, (prices[sell] - prices[buy]))
            else:
                # update the buy
                buy = sell
            sell += 1
        
        return maxProfit
