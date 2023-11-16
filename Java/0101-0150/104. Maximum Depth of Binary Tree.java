// https://leetcode.com/problems/maximum-depth-of-binary-tree/description/

class Solution {
    int maxDepth = 0;
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        //first left and then right
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        int height = left + right + 1;

        maxDepth = Math.max(maxDepth, height);

        return Math.max(left,right)+1;
    }
}
