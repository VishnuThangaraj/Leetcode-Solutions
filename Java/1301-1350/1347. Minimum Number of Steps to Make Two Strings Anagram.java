// https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/

// https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/solutions/4555665/o-n-java-python-javascript-typescript-c-c-character-count/

class Solution {
    public int minSteps(String s, String t) {
        int[] alphabets = new int[26];
        int result = 0;

        // Update frequency of characters in both string
        for(int index=0; index<s.length(); index++){
            alphabets[s.charAt(index) - 'a'] ++;
            alphabets[t.charAt(index) - 'a'] --;
        }

        for(int count : alphabets)
            result += Math.max(0, count);

        return result;
    }
}
