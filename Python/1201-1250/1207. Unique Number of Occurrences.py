# https://leetcode.com/problems/unique-number-of-occurrences/

# https://leetcode.com/problems/unique-number-of-occurrences/solutions/4578452/on-on-java-python-javascript-typescript-c-c-hashmap-solution/

class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        frequency = {}

        for num in arr: # Store element and its frequency
            frequency[num] = frequency.get(num,0) + 1

        # True if we get n different frequency for n different numbers
        return len(frequency) == len(set(frequency.values()))
