// https://leetcode.com/problems/pascals-triangle/description/

var generate = function(numRows) {
    let result = [];
    const dummy = [];
    dummy.push(1);
    result.push(dummy);

    for(let row = 0; row < numRows-1; row++){
        const current = [];
        current.push(1);

        for(let index=0; index<result.length-1; index++){
            current.push(result[row][index]+result[row][index+1]);
        }
        current.push(1);
        result.push(current);
    }

    return result;
};
