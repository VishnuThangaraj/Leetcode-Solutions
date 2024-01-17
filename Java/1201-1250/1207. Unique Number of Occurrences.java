// https://leetcode.com/problems/unique-number-of-occurrences/

// https://leetcode.com/problems/unique-number-of-occurrences/solutions/4578452/on-on-java-python-javascript-typescript-c-c-hashmap-solution/

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> frequency = new HashMap<>();

        for(int num : arr) // Store element and its frequency
            frequency.put(num, frequency.getOrDefault(num,0)+1);

        // store the frequency 
        HashSet<Integer> storage = new HashSet<>(frequency.values());

        // True if we get n different frequency for n different numbers
        return frequency.size() == storage.size();
    }
}
