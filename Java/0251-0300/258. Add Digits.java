// https://leetcode.com/problems/add-digits/

class Solution {
    public int addDigits(int num) {
        if(num <= 9) return num;

        int sum = 0;
        while(num > 0){
            sum += num%10;
            num /= 10;
        }

        if(sum <= 9) return sum;

        return addDigits(sum);
    }
}
