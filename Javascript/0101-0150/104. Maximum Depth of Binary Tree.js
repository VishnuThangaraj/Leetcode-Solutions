// https://leetcode.com/problems/maximum-depth-of-binary-tree/description/

 let Depth = 0;
var maxDepth = function(root) {
    if(root == null){
        return 0;
    }

    //first left and then right
    const left = maxDepth(root.left);
    const right = maxDepth(root.right);

    let height = left + right + 1;

    Depth = Math.max(Depth, height);

    return Math.max(left,right)+1;
};
