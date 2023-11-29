// https://leetcode.com/problems/find-words-containing-character/

var findWordsContaining = function(words, x) {
    const result = [];

    for(let index=0; index<words.length; index++){
        if(words[index].indexOf(x) != -1)
            result.add(index);
    }

    return result;
};
