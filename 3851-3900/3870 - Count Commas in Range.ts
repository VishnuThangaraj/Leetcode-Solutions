/*
3870. Count Commas in Range
https://leetcode.com/problems/count-commas-in-range/description/

*/

function countCommas(n: number): number {
    return String(n).length < 4 ? 0 : n - 999;
};
