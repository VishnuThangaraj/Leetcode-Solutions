// https://leetcode.com/problems/unique-number-of-occurrences/

// https://leetcode.com/problems/unique-number-of-occurrences/solutions/4578452/on-on-java-python-javascript-typescript-c-c-hashmap-solution/

var uniqueOccurrences = function(arr) {
    const frequency = new Map();

    for(let num of arr) // Store element and its frequency
        if(frequency.has(num)) frequency.set(num, frequency.get(num)+1);
        else frequency.set(num,1);

    // store the frequency 
    const storage = new Set(Array.from(frequency.values()));

    // True if we get n different frequency for n different numbers
    return frequency.size == storage.size;
};
