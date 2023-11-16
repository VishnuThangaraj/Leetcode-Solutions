// https://leetcode.com/problems/invert-binary-tree/

class Solution {
    public TreeNode invertTree(TreeNode root) {
        //dfs will be used LEFT,RIGHT,ROOT
        if(root == null){
            return null;
        }       
        //reach left first , then right
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        //swapping occurs
        root.left = right;
        root.right = left;
        return root;
    }
}
