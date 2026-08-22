/*
3622. Check Divisibility by Digit Sum and Product
https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/
*/

/**
 * @param {number} n
 * @return {boolean}
 */
var checkDivisibility = function(n) {
     let sum = 0, product = 1;
    let temp_n = n;

    // calculate sum and product
    while (temp_n > 0){
        let last_digit = temp_n  % 10;
        sum += last_digit;
        product *= last_digit;

        temp_n = Math.floor(temp_n / 10);
    }

    return n % (sum+product) == 0;
};
