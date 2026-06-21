/*
https://leetcode.com/problems/maximum-ice-cream-bars/description/

1833. Maximum Ice Cream Bars

It is a sweltering summer day, and a boy wants to buy some ice cream bars.
At the store, there are n ice cream bars. 
You are given an array costs of length n, where costs[i] is the price of the ith ice cream bar in coins. 
The boy initially has coins coins to spend, and he wants to buy as many ice cream bars as possible. 
Note: The boy can buy the ice cream bars in any order.
Return the maximum number of ice cream bars the boy can buy with coins coins.
You must solve the problem by counting sort.
*/

class Solution {
    maxIceCream(costs: number[], coins: number): number {
        let result = 0;
        const maxCost = Math.max(...costs);

        // Frequency array: freq[i] = number of ice creams costing i
        const freq: number[] = new Array(maxCost + 1).fill(0);

        // Count how many ice creams exist at each price
        for (const cost of costs) {
            freq[cost]++;
        }

        // Process prices from cheapest to most expensive
        for (let price = 1; price <= maxCost; price++) {
            // Skip prices that don't exist
            if (freq[price] === 0) continue;

            // Can't afford any ice cream at this price or higher
            if (coins < price) break;

            // Buy as many as possible at the current price
            const canBuy = Math.min(freq[price], Math.floor(coins / price));

            result += canBuy;
            coins -= canBuy * price;
        }

        return result;
    }
}