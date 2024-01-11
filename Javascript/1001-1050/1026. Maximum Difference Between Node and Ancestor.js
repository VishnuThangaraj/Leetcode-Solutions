// https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/

// https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/solutions/4543927/o-n-java-python-javascript-typescript-c-c-binary-tree/

var maxAncestorDiff = function(root) {
    if(root == null) return 0;
    let result = 0;

    const FindDifference = function (node, min, max){
        if(node == null) return;

        result = Math.max(result, 
            Math.max(Math.abs(min-node.val), Math.abs(max-node.val)));

        min = Math.min(min, node.val);
		max = Math.max(max, node.val);
        
		FindDifference(node.left, min, max);
		FindDifference(node.right, min, max);
    } 

    // function(root, minValue, maxValue) Root will be the min and max value
    FindDifference(root, root.val, root.val);
    return result;
};
