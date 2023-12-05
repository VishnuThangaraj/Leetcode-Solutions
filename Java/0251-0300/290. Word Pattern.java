// https://leetcode.com/problems/word-pattern/

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] storage = s.split(" ");
        if(storage.length != pattern.length()) return false;

        HashMap<Character, String> map = new HashMap<>();

        for(int index=0; index<pattern.length(); index++){
            char key = pattern.charAt(index);
            String word = storage[index];

            // check for pattern
            if(map.containsKey(key)){
                if(!map.get(key).equals(word)) return false; //invalid match
            }
            else{
                if(map.containsValue(word)) return false; 
                map.put(key,word);
            }
        }
        return true;
    }
}
