// https://leetcode.com/problems/binary-tree-paths/description/

var binaryTreePaths = function(root) {
    const result = [];

    var getPaths = function(node, path){
        if(node.left == null && node.right == null){
            result.push(path);
            return;
        }

        // Get path for left and right nodes
        if(node.left != null)
            getPaths(node.left, path+"->"+node.left.val);
        if(node.right != null)
            getPaths(node.right, path+"->"+node.right.val);
    };
    
    getPaths(root, root.val+"");
    return result;
};
