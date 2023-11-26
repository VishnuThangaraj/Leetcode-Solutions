// https://leetcode.com/problems/valid-palindrome/

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        //remove non-alphabet characters
        StringBuilder palindrome = new StringBuilder();

        for(char letter : s.toCharArray()){
            if((letter >= 'a' && letter <= 'z') || (letter >= '0' && letter <= '9'))
                palindrome.append(letter);
        }

        // Two-Pointers
        int first = 0, second = palindrome.length()-1;

        while(first <= second){
            if(palindrome.charAt(first++) != palindrome.charAt(second--))
                return false;
        }

        return true; // Its a palindrome
    }
}
