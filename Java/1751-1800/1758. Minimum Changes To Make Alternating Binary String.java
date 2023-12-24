// https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/

class Solution {
    public int minOperations(String s) {
        boolean binary = true;
        int zero = 0, one = 0;

        for(char letter : s.toCharArray()){
            if(binary){
                if(letter == '0') one++;
                else zero++;
            }else{
                if(letter == '0') zero++;
                else one++;
            }
            binary = !binary;
        }

        return Math.min(one, zero);
    }
}
