// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

var lengthOfLongestSubstring = function(s) {
    //use two poleter approach
    let start  = 0; 
    let end = 0;
    let max = 0;

    //HashSet to store unique characters
    const storage = new Set();
    let length = 0; //length of current substring

    while(end < s.length){
        let letter = s[end];
        while(storage.has(letter)){
            storage.delete(s[start]);
            length--;start++;
        }

        if(!storage.has(letter)){
            //add to HashSet
            storage.add(letter);
            end++;length++;
            max = Math.max(max , length);
        }
    }
    return max;
};
