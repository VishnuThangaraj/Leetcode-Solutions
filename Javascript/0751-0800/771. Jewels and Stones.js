// https://leetcode.com/problems/jewels-and-stones/

var numJewelsInStones = function(jewels, stones) {
    let count = 0;
        
    for(let stone of stones)
        if(jewels.indexOf(stone) != -1) count++;

    return count;
};
