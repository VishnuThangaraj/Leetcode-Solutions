// https://leetcode.com/problems/01-matrix/

var updateMatrix = function(mat) {
    const rowSize = mat.length;
    const colSize = mat[0].length;
    const MAX_VALUE = rowSize * colSize;

    if(mat == null || rowSize == 0 || colSize == 0)
        return [];

    storage = [];

    // Add matrix with 0 to queue
    for(let row = 0; row < rowSize; row++){
        for(let col = 0; col < colSize; col++){
            if(mat[row][col] == 1)
                mat[row][col] = MAX_VALUE;
            else
                storage.push([row, col]);
        }
    }

    direction = [[1,0], [-1,0], [0,1], [0,-1]];

    while(storage.length > 0){
        let current = storage.shift();

        for(const [...dir] of direction){
            let row = current[0] + dir[0], col = current[1] + dir[1];

            //Check if the row and col is in range
            if(row >= 0 && row < rowSize && col >= 0 && col < colSize){
                if(mat[row][col] > mat[current[0]][current[1]]+1){
                    storage.push([row, col]);
                    mat[row][col] = mat[current[0]][current[1]]+1;
                }
            }
        }
    }

    return mat;
};
