/*
1833. Maximum Ice Cream Bars
https://leetcode.com/problems/maximum-ice-cream-bars/description/

Solution 
https://leetcode.com/problems/maximum-ice-cream-bars/solutions/8348308/onk-ok-java-python-javascript-typescript-bq72
*/

/**
 * @param {number[]} costs
 * @param {number} coins
 * @return {number}
 */
var maxIceCream = function(costs, coins) {
    let result = 0;
    const maxCost = Math.max(...costs);

    // Frequency array: freq[i] = number of ice creams costing i
    const freq = new Array(maxCost + 1).fill(0);

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
};