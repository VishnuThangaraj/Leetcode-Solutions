// https://leetcode.com/problems/valid-anagram/description/

/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    //strings of different size cant be a valid anagram
    if(s.length != t.length){
        return false;
    }
    //create hashMap to store the character and its occcurance
    first = new Map();
    second = new Map();

    //add the first string to HahsMap
    for(let index=0; index<s.length; index++){
        //get the character at particular index
        letter = s[index];
        //check if the alphabet already exists in Hashmap
        if(first.has(letter)){
            //update the count
            first.set(letter,first.get(letter)+1);
            continue;
        }
        //does not exists in HashMap
        first.set(letter,1);
    }

    //add the second string to HahsMap
    for(let index=0; index<t.length; index++){
        //get the character at particular index
        letter = t[index];
        //check if the alphabet already exists in Hashmap
        if(second.has(letter)){
            //update the count
            second.set(letter,second.get(letter)+1);
            continue;
        }
        //does not exists in HashMap
        second.set(letter,1);
    }

    //iterate the second string to check all the character occured same number of times
    for (let [key,value] of first) {
        if (!second.has(key) || (value != second.get(key))) {
            return false;
        }
    }

    return true; //valid anagram
};
