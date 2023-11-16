// https://leetcode.com/problems/invert-binary-tree/

var invertTree = function(root) {
    //dfs will be used LEFT,RIGHT,ROOT
    if(root == null){
        return null;
    }       
    //reach left first , then right
    let left = invertTree(root.left);
    let right = invertTree(root.right);
    //swapping occurs
    root.left = right;
    root.right = left;
    return root;
};
