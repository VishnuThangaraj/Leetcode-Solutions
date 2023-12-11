// https://leetcode.com/problems/minimum-depth-of-binary-tree/description/

var minDepth = function(root) {
    if(root == null) return 0;
    if(root.left == null && root.right == null) return 1;

    let left = (root.left != null) ? minDepth(root.left) : 9999;
    let right = (root.right != null) ? minDepth(root.right) : 9999;

    return Math.min(left, right)+1;
};
