// https://leetcode.com/problems/longest-valid-parentheses/description/

/**
 * @param {string} s
 * @return {number}
 */
var longestValidParentheses = function(s) {
    let result = 0;
    // stack to store the index of the parenthesis
    stack = [];
    stack.push(-1);

    for(let index=0; index<s.length; index++){
        letter = s[index];

        // push to stack if its opening parenthesis
        if(letter == '(')
            stack.push(index);
        else{
            // closing parenthesis
            // pop the valid opening paranthesis from the stack
            if(stack.length != 0)
                stack.pop();

            // update the result
            if(stack.length != 0)
                result = Math.max(result, index - stack[stack.length-1]);
            else
                // empty stack ... add the current index as starting point
                stack.push(index);
        }
    }

    return result;
};
