// https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75

var mergeAlternately = function(word1, word2) {
    let result = "";

    const length  = word1.length > word2.length ? word1.length : word2.length;

    for(let index=0; index<length; index++){
        // addend to result if its in the range
        if(index < word1.length)
            result += word1[index];
        if(index < word2.length)
            result += word2[index];
    }

    return result;
};
