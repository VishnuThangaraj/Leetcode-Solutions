// https://leetcode.com/problems/generate-parentheses/description/

var generateRecursively = function(result, n, opening, closing, current){
    if(current.length == n*2){
        result.push(current);
        return;
    }

    // Recursive calls
    if(opening < n){
        generateRecursively(result,n, opening+1, closing, current+"(");
    }
    if(closing < opening){
        generateRecursively(result,n, opening, closing+1, current+")");
    }
};

var generateParenthesis = function(n) {
    const result = [];
    generateRecursively(result, n, 0, 0, "");
    return result;
};
