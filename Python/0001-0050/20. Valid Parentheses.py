# https://leetcode.com/problems/valid-parentheses/description/

class Solution:
    def isValid(self, s: str) -> bool:
        # store the parantheses in the stack
        storage = []

        # lets traverse throught the string
        for index in range(0, len(s)):
            # store the characters
            bracket = s[index]

            # check for opening paranthesis
            if bracket == '{' or bracket == '(' or bracket == '[':
                storage.append(bracket)
            
            # check for valid paranthesis in stack
            elif bracket == '}':
                if len(storage) == 0 or storage[len(storage)-1] != '{':
                    return False
                
                storage.pop() # remove from stack as its valid
            
            elif bracket == ']':
                if len(storage) == 0 or storage[len(storage)-1] != '[':
                    return False
                
                storage.pop() # remove from stack as its valid
            
            elif bracket == ')':
                if len(storage) == 0 or storage[len(storage)-1] != '(':
                    return False
                
                storage.pop() # remove from stack as its valid
            
        
        # final check is there any un-closed paranthesis in the stack
        if len(storage) != 0:
            return False # unclosed paranthesis is there in stack
        

        return True
        
