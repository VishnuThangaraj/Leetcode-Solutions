'''
https://leetcode.com/problems/maximum-ice-cream-bars/description/

1833. Maximum Ice Cream Bars

It is a sweltering summer day, and a boy wants to buy some ice cream bars.
At the store, there are n ice cream bars. 
You are given an array costs of length n, where costs[i] is the price of the ith ice cream bar in coins. 
The boy initially has coins coins to spend, and he wants to buy as many ice cream bars as possible. 
Note: The boy can buy the ice cream bars in any order.
Return the maximum number of ice cream bars the boy can buy with coins coins.
You must solve the problem by counting sort.

'''

class Solution:
    def maxIceCream(self, costs: list[int], coins: int) -> int:
        result = 0
        max_cost = max(costs)

        # Frequency array: freq[i] = number of ice creams costing i
        freq = [0] * (max_cost + 1)

        # Count how many ice creams exist at each price
        for cost in costs:
            freq[cost] += 1

        # Process prices from cheapest to most expensive
        for price in range(1, max_cost + 1):

            # Skip prices that don't exist
            if freq[price] == 0:
                continue

            # Can't afford any ice cream at this price or higher
            if coins < price:
                break

            # Buy as many as possible at the current price
            can_buy = min(freq[price], coins // price)

            result += can_buy
            coins -= can_buy * price

        return result