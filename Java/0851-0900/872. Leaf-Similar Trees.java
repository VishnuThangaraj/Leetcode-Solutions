// https://leetcode.com/problems/leaf-similar-trees/

// https://leetcode.com/problems/leaf-similar-trees/solutions/4532192/o-n-m-java-python-javascript-typescript-c-c-binary-tree-dfs/?envType=daily-question&envId=2024-01-09

class Solution {
    // Function to add leaves to the arrayList
    public void getLeaves(TreeNode node, List<Integer> storage){
        if(node == null) return;

        if(node.left == null && node.right == null){
            // Leaf found
            storage.add(node.val);
            return;
        }
        
        getLeaves(node.right, storage);
        getLeaves(node.left, storage);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaf1 = new ArrayList<>();
        List<Integer> leaf2 = new ArrayList<>();

        getLeaves(root1, leaf1);
        getLeaves(root2, leaf2);

        return leaf1.equals(leaf2);
    }
}
