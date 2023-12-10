// https://leetcode.com/problems/transpose-matrix/

var transpose = function(matrix) {
    const rowSize = matrix.length;
    const colSize = matrix[0].length;

    result = [];

    for(let col = 0; col<colSize; col++){
        current = []
        for(let row = 0; row < rowSize; row++){
            current.push(matrix[row][col]);
        }
        result.push(current);
    }

    return result;
};
