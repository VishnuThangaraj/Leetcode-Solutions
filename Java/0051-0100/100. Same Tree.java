// https://leetcode.com/problems/same-tree/description/

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true; //reached end (or) empty tree
        }

        if(p == null || q == null){
            return false; //any one of the node becomes null
        }

        //check current node value
        if(p.val != q.val){
            return false; //value not-matching
        }

        //check for left and right sides
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
