// https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/

var minOperations = function(s) {
    let binary = true;
    let zero = 0, one = 0;

    for(let letter of s){
        if(binary){
            if(letter == '0') one++;
            else zero++;
        }else{
            if(letter == '0') zero++;
            else one++;
        }
        binary = !binary;
    }

    return Math.min(one, zero);
};
