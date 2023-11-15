// https://leetcode.com/problems/valid-anagram/description/

class Solution {
    public boolean isAnagram(String s, String t) {
        //strings of different size cant be a valid anagram
        if(s.length()!=t.length()){
            return false;
        }
        //create hashMap to store the character and its occcurance
        HashMap<Character, Integer> first = new HashMap<>();
        HashMap<Character, Integer> second = new HashMap<>();

        //add the first string to HahsMap
        for(int index=0; index<s.length(); index++){
            //get the character at particular index
            char letter = s.charAt(index);
            //check if the alphabet already exists in Hashmap
            if(first.containsKey(letter)){
                //update the count
                first.put(letter,first.get(letter)+1);
                continue;
            }
            //does not exists in HashMap
            first.put(letter,1);
        }

        //add the second string to HahsMap
        for(int index=0; index<t.length(); index++){
            //get the character at particular index
            char letter = t.charAt(index);
            //check if the alphabet already exists in Hashmap
            if(second.containsKey(letter)){
                //update the count
                second.put(letter,second.get(letter)+1);
                continue;
            }
            //does not exists in HashMap
            second.put(letter,1);
        }

        //iterate the second string to check all the character occured same number of times
        for (Character c:first.keySet()) {
            if (!second.containsKey(c) || !first.get(c).equals(second.get(c))) {
                return false;
            }
        }

        return true; //valid anagram
    }
}
