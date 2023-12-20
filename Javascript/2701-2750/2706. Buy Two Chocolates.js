// https://leetcode.com/problems/buy-two-chocolates/

var buyChoco = function(prices, money) {
    let min1 = Number.MAX_SAFE_INTEGER, min2 = min1;

    for(let price of prices){
        if(price < min1){
            min2 = min1;
            min1=price;
        }else if(price < min2) min2 = price;
    }

    const cost = min1 + min2;

    if(cost <= money) return money - cost;
    
    return money;
};
