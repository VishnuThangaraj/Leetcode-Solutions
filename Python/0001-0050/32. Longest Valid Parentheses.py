# https://leetcode.com/problems/longest-valid-parentheses/description/

class Solution:
    def longestValidParentheses(self, s: str) -> int:
        result = 0
        # stack to store the index of the parenthesis
        stack = []
        stack.append(-1)

        for index in range(0,len(s)):
            letter = s[index]

            # push to stack if its opening parenthesis
            if letter == '(':
                stack.append(index)
            else:
                # closing parenthesis
                # pop the valid opening paranthesis from the stack
                if len(stack) != 0:
                    stack.pop()

                # update the result
                if len(stack) != 0:
                    result = max(result, index - stack[len(stack)-1])
                else:
                    # empty stack ... add the current index as starting point
                    stack.append(index)

        return result
