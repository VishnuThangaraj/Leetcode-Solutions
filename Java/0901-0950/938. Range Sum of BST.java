// https://leetcode.com/problems/range-sum-of-bst/

// https://leetcode.com/problems/range-sum-of-bst/solutions/4526122/o-n-java-python-javascript-typescript-c-c-binary-search-tree/

class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null)
            return 0;

        if(root.val < low)
            return rangeSumBST(root.right, low, high);
        else if(root.val > high)
            return rangeSumBST(root.left, low, high);

        return root.val + rangeSumBST(root.right, low, high)+rangeSumBST(root.left, low, high);
    }
}
