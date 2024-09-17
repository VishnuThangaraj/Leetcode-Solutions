# https://leetcode.com/problems/uncommon-words-from-two-sentences/description/
# Solution :  https://leetcode.com/problems/uncommon-words-from-two-sentences/solutions/5799620/java-python-javascript-typescript-hashmap-solution-beats-100/?envType=daily-question&envId=2024-09-17

class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        storage = {}
        result = []
        
        # Count occurrences of words in s1
        for word in s1.split():
            storage[word] = storage[word] + 1 if word in storage else 1
        
        # Count occurrences of words in s2
        for word in s2.split():
            storage[word] = storage[word] + 1 if word in storage else 1
        
        # Add the unique words to the result list
        for word, count in storage.items():
            if count == 1:
                result.append(word)
        
        return result
