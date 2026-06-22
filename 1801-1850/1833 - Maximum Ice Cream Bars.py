'''
1833. Maximum Ice Cream Bars
https://leetcode.com/problems/maximum-ice-cream-bars/description/

Solution 
https://leetcode.com/problems/maximum-ice-cream-bars/solutions/8348308/onk-ok-java-python-javascript-typescript-bq72
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