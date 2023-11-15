// https://leetcode.com/problems/valid-parentheses/description/

class Solution {
    public boolean isValid(String s) {
        //store the parantheses in the stack
        Stack<Character> storage = new Stack<>();

        //lets traverse throught the string
        for(int index=0; index<s.length(); index++){
            //store the characters
            char bracket = s.charAt(index);

            //check for opening paranthesis
            if(bracket == '{' || bracket == '(' || bracket == '['){
                storage.push(bracket);
            }
            //check for valid paranthesis in stack
            else if(bracket == '}'){
                if(storage.isEmpty() || storage.peek() != '{'){
                    return false;
                }
                storage.pop(); //remove from stack as its valid
            }
            else if(bracket == ']'){
                if(storage.isEmpty() || storage.peek() != '['){
                    return false;
                }
                storage.pop(); //remove from stack as its valid
            }
            else if(bracket == ')'){
                if(storage.isEmpty() || storage.peek() != '('){
                    return false;
                }
                storage.pop(); //remove from stack as its valid
            }
        }
        //final check is there any un-closed paranthesis in the stack
        if(!storage.isEmpty()){
            return false; //unclosed paranthesis is there in stack
        }

        return true;
    }
}
