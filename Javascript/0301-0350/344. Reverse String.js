// https://leetcode.com/problems/reverse-string/

var reverseString = function(s) {
    let start = 0, end = s.length-1; // Two-Pointers
    let temp = ' '; // Temporary Variable 

    while(start < end){ // Swap the characters in start and end pointers
        temp = s[start];
        s[start++] = s[end];
        s[end--] = temp;
    }
};
