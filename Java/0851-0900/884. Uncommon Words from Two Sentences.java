// https://leetcode.com/problems/uncommon-words-from-two-sentences/description/
// Solution :  https://leetcode.com/problems/uncommon-words-from-two-sentences/solutions/5799620/java-python-javascript-typescript-hashmap-solution-beats-100/?envType=daily-question&envId=2024-09-17

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> storage = new HashMap<>();
        List<String> result = new ArrayList<>();
        
        for(String word : s1.split(" ")){ // Count Occurance of words in S1
            storage.put(word, storage.getOrDefault(word, 0)+1);
        }

        for(String word : s2.split(" ")){ // Count Occurance of words in S2
            storage.put(word, storage.getOrDefault(word, 0)+1);
        }

        // Add the Unique Words to List 
        for(String word : storage.keySet())
            if(storage.get(word) == 1) result.add(word);

        return result.toArray(new String[0]);
    }
}
