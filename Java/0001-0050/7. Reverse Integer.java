// https://leetcode.com/problems/reverse-integer/description/

class Solution {
    public int reverse(int x) {
        long reversed = 0; //to avoid error when number is out of range of integer
        //negative value indicator
        boolean negative = false;

        if(x<0){
            negative = true; //number is negative
            x = Math.abs(x); //convert to positive
        }

        //reverse the integer
        while(x>0){
            reversed = (reversed*10) + (x%10); //update reversed
            //check if reversed is greater than number supported by integer
            if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
                return 0;
            }
            x/=10; //reduce the x
        }

        //if the number given is negative change back to negative
        if(negative){
            //convert to negative and typecast to integer
            return (int)-1 * (int)reversed;
        }

        return (int)reversed;
    }
}
