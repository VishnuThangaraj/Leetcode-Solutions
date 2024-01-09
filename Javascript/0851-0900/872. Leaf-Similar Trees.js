// https://leetcode.com/problems/leaf-similar-trees/

// https://leetcode.com/problems/leaf-similar-trees/solutions/4532192/o-n-m-java-python-javascript-typescript-c-c-binary-tree-dfs/?envType=daily-question&envId=2024-01-09

var leafSimilar = function(root1, root2) {
    const leaf1 = [];
    const leaf2 = [];

    // Function to add leaves to the List
    var getLeaves = function(node, storage){
        if(node == null) return;

        if(node.left == null && node.right == null){
            // Leaf found
            storage.push(node.val);
            return;
        }
        
        getLeaves(node.right, storage);
        getLeaves(node.left, storage);
    }

    getLeaves(root1, leaf1);
    getLeaves(root2, leaf2);

    return leaf1.toString() === leaf2.toString();
};
