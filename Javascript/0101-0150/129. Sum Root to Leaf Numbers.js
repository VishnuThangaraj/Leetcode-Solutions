// https://leetcode.com/problems/sum-root-to-leaf-numbers/

var sumNumbers = function(root) {
    return DFS(root, 0);
};

var DFS = function (node, sum){
    if(node == null) return 0; // null node
    // leaf node found 
    if(node.left == null && node.right == null) return (sum*10)+node.val;

    let left = DFS(node.left, (sum*10)+node.val); // left sum
    let right = DFS(node.right, (sum*10)+node.val); // right sum

    return left + right;
}
