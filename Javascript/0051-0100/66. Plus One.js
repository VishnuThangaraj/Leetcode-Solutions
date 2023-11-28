// https://leetcode.com/problems/plus-one/

var plusOne = function(digits) {
    const size = digits.length;
    let rem = 1;

    for(let index=size-1; index>=0; index--){
        if(rem == 1){
            digits[index]++;
            rem = (digits[index] <= 9) ? 0 : 1;
            digits[index] = digits[index]%10;
        }
    }

    if(rem == 1)
        digits.unshift(1);
    
    return digits;
};
