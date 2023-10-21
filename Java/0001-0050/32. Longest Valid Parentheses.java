// https://leetcode.com/problems/longest-valid-parentheses/description/

class Solution {
    public int longestValidParentheses(String s) {
        int result = 0;
        // stack to store the index of the parenthesis
        Stack<Integer> storage = new Stack<>();
        storage.add(-1);

        for(int index=0; index<s.length(); index++){
            char letter = s.charAt(index);

            // push to stack if its opening parenthesis
            if(letter == '(')
                storage.push(index);
            else{
                // closing parenthesis
                // pop the valid opening paranthesis from the stack
                if(!storage.isEmpty())
                    storage.pop();

                // update the result
                if(!storage.isEmpty())
                    result = Math.max(result, index - storage.peek());
                else
                    // empty stack ... add the current index as starting point
                    storage.push(index);
            }
        }

        return result;
    }
}
