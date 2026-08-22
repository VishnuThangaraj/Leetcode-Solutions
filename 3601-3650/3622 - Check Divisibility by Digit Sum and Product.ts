/*
3622. Check Divisibility by Digit Sum and Product
https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/
*/

function checkDivisibility(n: number): boolean {
    let sum: number = 0, product: number = 1;
    let temp_n:number = n;

    // calculate sum and product
    while (temp_n > 0){
        let last_digit: number = temp_n  % 10;
        sum += last_digit;
        product *= last_digit;

        temp_n = Math.floor(temp_n / 10);
    }

    return n % (sum+product) == 0;
};  
