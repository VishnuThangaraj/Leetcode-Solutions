// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

var maxProfit = function(prices) {
    let maxProfit = 0;
    // Two Pointers
    let buy = 0, sell = 0;

    while(sell < prices.length){
        if(prices[buy] < prices[sell]){
            // update maxProfit
            maxProfit = Math.max(maxProfit, (prices[sell] - prices[buy]));
        }else{
            // update the buying price
            buy = sell;
        }
        sell++;
    }
    return maxProfit;
};
