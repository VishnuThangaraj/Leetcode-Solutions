// https://leetcode.com/problems/add-digits/

var addDigits = function(num) {
    if(num <= 9) return num;

    let sum = 0;
    while(num > 0){
        sum += num%10;
        num = Math.floor(num/10);
    }

    if(sum <= 9) return sum;

    return addDigits(sum);
};
