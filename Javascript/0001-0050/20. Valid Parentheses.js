// https://leetcode.com/problems/valid-parentheses/description/

var isValid = function(s) {
    //store the parantheses in the stack
    storage = [];

    //lets traverse throught the string
    for(let index=0; index<s.length; index++){
        //store the characters
        bracket = s[index];

        //check for opening paranthesis
        if(bracket == '{' || bracket == '(' || bracket == '['){
            storage.push(bracket);
        }
        //check for valid paranthesis in stack
        else if(bracket == '}'){
            if(storage.length == 0 || storage[storage.length-1] != '{'){
                return false;
            }
            storage.pop(); //remove from stack as its valid
        }
        else if(bracket == ']'){
            if(storage.length == 0 || storage[storage.length-1] != '['){
                return false;
            }
            storage.pop(); //remove from stack as its valid
        }
        else if(bracket == ')'){
            if(storage.length == 0 || storage[storage.length-1] != '('){
                return false;
            }
            storage.pop(); //remove from stack as its valid
        }
    }
    //final check is there any un-closed paranthesis in the stack
    if(storage.length != 0){
        return false; //unclosed paranthesis is there in stack
    }

    return true;
};
