// https://leetcode.com/problems/validate-binary-search-tree/description/

class Solution {
    public boolean isValidBST(TreeNode root) {
        //helper function
        return isValidBST(root,null,null);
    }

    private boolean isValidBST(TreeNode node, Integer low , Integer high){
        if(node == null){
            return true;
        }

        //should be greater than low value
        if(low!=null && node.val <= low){
            return false;
        }

        //should be smaller then high value
        if(high!=null && node.val >= high){
            return false;
        }

        return (isValidBST(node.left,low,node.val) && isValidBST(node.right,node.val,high));
    }
}
