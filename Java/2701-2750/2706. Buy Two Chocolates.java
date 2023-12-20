// https://leetcode.com/problems/buy-two-chocolates/

class Solution {
    public int buyChoco(int[] prices, int money) {
        int min1 = Integer.MAX_VALUE, min2 = min1;

        for(int price : prices){
            if(price < min1){
                min2 = min1;
                min1=price;
            }else if(price < min2) min2 = price;
        }

        int cost = min1 + min2;

        if(cost <= money) return money - cost;
        
        return money;
    }
}
