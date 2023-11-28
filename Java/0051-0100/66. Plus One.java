// https://leetcode.com/problems/plus-one/

class Solution {
    public int[] plusOne(int[] digits) {
        int size = digits.length;
        int[] result = new int[size+1];
        int rem = 1;

        for(int index=size-1; index>=0; index--){
            if(rem == 1){
                digits[index]++;
                rem = (digits[index] <= 9) ? 0 : 1;
                digits[index] = digits[index]%10;
            }
            result[index+1] = digits[index];
        }

        if(rem == 0)
            return digits;
        
        result[0] = 1;
        return result;
    }
}
