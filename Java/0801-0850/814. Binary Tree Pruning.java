// https://leetcode.com/problems/binary-tree-pruning/

class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if(root == null) return null;

        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);

        if(root.val == 0)
            if (root.left == null && root.right == null) return null;

        return root;
    }
}
