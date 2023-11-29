// https://leetcode.com/problems/find-words-containing-character/

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();

        for(int index=0; index<words.length; index++){
            if(words[index].contains(x+""))
                result.add(index);
        }

        return result;
    }
}
