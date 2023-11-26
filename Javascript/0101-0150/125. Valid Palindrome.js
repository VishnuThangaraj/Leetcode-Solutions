// https://leetcode.com/problems/valid-palindrome/

var isPalindrome = function(s) {
    s = s.toLowerCase();
    //remove non-alphabet characters
    let palindrome = "";

    for(let letter of s){
        if((letter >= 'a' && letter <= 'z') || (letter >= '0' && letter <= '9'))
            palindrome+=letter;
    }

    // Two-Pointers
    let first = 0, second = palindrome.length-1;

    while(first <= second){
        if(palindrome.charAt(first++) != palindrome.charAt(second--))
            return false;
    }

    return true; // Its a palindrome
};
