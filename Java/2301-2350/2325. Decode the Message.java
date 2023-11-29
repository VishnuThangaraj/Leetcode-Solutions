// https://leetcode.com/problems/decode-the-message/

class Solution {
    public String decodeMessage(String key, String message) {
        StringBuilder result = new StringBuilder();
        StringBuilder alphaKey = new StringBuilder();

        // Assign the alphabets
        HashSet<Character> storage = new HashSet<>();

        for(char letter : key.toCharArray()){
            if(storage.contains(letter) || letter == ' ')
                continue; // Repeated character
            
            alphaKey.append(letter); // add the alphabet to StringBuilder
            storage.add(letter); // Add to HashSet to avoid the duplicates
        }

        for(char letter : message.toCharArray()){
            if(letter == ' ')
                result.append(letter);
            else{ // alphabet
                int index = alphaKey.indexOf(letter+"");
                result.append((char)('a'+index));
            }
        }

        return result.toString();
    }
}
