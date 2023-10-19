// https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75

// TWO-POINTER APPROACH

lass Solution {
    public String mergeAlternately(String word1, String word2) {
        // two pointers
        int first =0, second =0;
        String result = "";

        while(first < word1.length() && second < word2.length()){
            result += word1.charAt(first++);
            result += word2.charAt(second++);
        }

        // append the balance string
        if(first < word1.length())
            result += word1.substring(first);
        if(second < word2.length())
            result += word2.substring(second);

        return result;
    }
}

// USING STRINGBUILDER

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();

        int length = (word1.length() < word2.length()) ? word2.length() : word1.length();

        for(int index=0; index<length; index++){
            // add to stringbuilder if its in the range
            if(index < word1.length()) 
                result.append(word1.charAt(index));

            if(index < word2.length())
                result.append(word2.charAt(index));
        }

        return result.toString();
    }
}
