// https://leetcode.com/problems/determine-if-two-strings-are-close/

// https://leetcode.com/problems/determine-if-two-strings-are-close/solutions/4561511/o-nlogn-java-python-javascript-typescript-c-c-character-count/

class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] frequency1 = new int[26];
        int[] frequency2 = new int[26];

        for(char letter : word1.toCharArray())
            frequency1[letter - 'a']++;

        for(char letter : word2.toCharArray())
            frequency2[letter - 'a']++;

        for(int index=0; index<26; index++){
            if(frequency1[index] == 0 && frequency2[index] != 0)
                return false;
            if(frequency1[index] != 0 && frequency2[index] == 0)
                return false;
        }

        Arrays.sort(frequency1);
        Arrays.sort(frequency2);

        return Arrays.equals(frequency1, frequency2);
    }
}
