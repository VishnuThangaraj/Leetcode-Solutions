// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        //use two pointer approach
        int start  = 0; 
        int end = 0;
        int max = 0;

        //HashSet to store unique characters
        HashSet<Character> storage = new HashSet<>();
        int length = 0; //length of current substring

        while(end < s.length()){
            char letter = s.charAt(end);
            while(storage.contains(letter)){
                storage.remove(s.charAt(start));
                length--;start++;
            }

            if(!storage.contains(letter)){
                //add to HashSet
                storage.add(letter);
                end++;length++;
                max = Math.max(max , length);
            }
        }
        return max;
    }
}
