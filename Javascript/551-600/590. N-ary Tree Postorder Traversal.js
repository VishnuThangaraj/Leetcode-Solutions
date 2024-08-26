// https://leetcode.com/problems/n-ary-tree-postorder-traversal/

var postorder = function(root) {
    let result = [];

    const DFS = (node) => {
        if(node === null) return;
    
        // Visit Child Nodes
        if(node.children != null && node.children.length > 0){
            node.children.forEach((children) => {
                DFS(children);
            })
        }

        result.push(node.val);
    }

    DFS(root); // Recusrsive DFS

    return result;
};
