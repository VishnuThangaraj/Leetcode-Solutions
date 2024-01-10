// https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected/

// https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected/solutions/4538708/o-n-java-python-javascript-typescript-c-c-binary-tree/

var amountOfTime = function(root, start) {
    let result = 0;

    const DFS = function(node, start){
        if(node == null) return 0;

        let leftDepth = DFS(node.left, start);
        let rightDepth = DFS(node.right, start);

        if(node.val == start){
            result = Math.max(leftDepth, rightDepth);
            return -1;
        }
        else if(leftDepth >= 0 && rightDepth >= 0)
            return Math.max(leftDepth, rightDepth)+1;
        
        result = Math.max(result, Math.abs(leftDepth - rightDepth));
        return Math.min(leftDepth, rightDepth) - 1;
    };

    DFS(root, start);
    return result;
};
