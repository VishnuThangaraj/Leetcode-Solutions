// https://leetcode.com/problems/reverse-string/

class Solution {
    public void reverseString(char[] s) {
        int start = 0, end = s.length-1; // Two-Pointers
        char temp = ' '; // Temporary Variable 

        while(start < end){ // Swap the characters in start and end pointers
            temp = s[start];
            s[start++] = s[end];
            s[end--] = temp;
        }
    }
}
