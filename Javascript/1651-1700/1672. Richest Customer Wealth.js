// https://leetcode.com/problems/richest-customer-wealth/

var maximumWealth = function(accounts) {
    let Rich = 0;

    for(const [...amount] of accounts){
        let current = 0;
        for(let balance of amount){
            current += balance;
        }
        Rich = (Rich < current) ? current : Rich;
    }

    return Rich;
};
