// https://leetcode.com/problems/uncommon-words-from-two-sentences/description/
// Solution :  https://leetcode.com/problems/uncommon-words-from-two-sentences/solutions/5799620/java-python-javascript-typescript-hashmap-solution-beats-100/?envType=daily-question&envId=2024-09-17

var uncommonFromSentences = function(s1, s2) {
    const storage  = new Map();

    // Count Occurance of words in S1
    s1.split(" ").forEach((element) => {
        storage.set(element, (storage.get(element)+1) || 1);
    })

    // Count Occurance of words in S2
    s2.split(" ").forEach((element) => {
        storage.set(element, (storage.get(element)+1) || 1);
    })

    // Return Unique Words from Map
    return Array.from(storage).filter(([key,value]) => value === 1)
    .map(([key,value]) => key);
};

// Type Script
function uncommonFromSentences(s1: string, s2: string): string[] {
    const storage : Map<string, number> = new Map();

    // Count Occurance of words in S1
    s1.split(" ").forEach((element) => {
        storage.set(element, (storage.get(element)+1) || 1);
    })

    // Count Occurance of words in S2
    s2.split(" ").forEach((element) => {
        storage.set(element, (storage.get(element)+1) || 1);
    })

    // Return Unique Words from Map
    return Array.from(storage).filter(([key,value]) => value === 1).map(([key,value]) => key);
};
