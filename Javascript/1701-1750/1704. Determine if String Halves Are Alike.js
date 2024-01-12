// https://leetcode.com/problems/determine-if-string-halves-are-alike/

// https://leetcode.com/problems/determine-if-string-halves-are-alike/solutions/4549382/o-n-java-python-javascript-typescript-c-c-string-matching/

var halvesAreAlike = function(s) {
    const vowels = new Set(['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'])
    let size = s.length;
    let count = 0;
    
    for(let index = 0; index < size /2; index++) {
        if(vowels.has(s[index]))
            count++;

        if(vowels.has(s[index + size /2]))
            count--;
    }
    
    return count == 0;
};
