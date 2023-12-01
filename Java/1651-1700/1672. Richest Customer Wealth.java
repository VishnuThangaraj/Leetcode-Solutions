// https://leetcode.com/problems/richest-customer-wealth/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int Rich = 0;

        for(int[] amount : accounts){
            int current = 0;
            for(int balance : amount){
                current += balance;
            }
            Rich = (Rich < current) ? current : Rich;
        }

        return Rich;
    }
}
