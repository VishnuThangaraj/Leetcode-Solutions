// https://leetcode.com/problems/sum-root-to-leaf-numbers/

class Solution {
    public int sumNumbers(TreeNode root) {
        return DFS(root, 0);
    }

    public int DFS(TreeNode node, int sum){
        if(node == null) return 0; // null node
        // leaf node found 
        if(node.left == null && node.right == null) return (sum*10)+node.val;

        int left = DFS(node.left, (sum*10)+node.val); // left sum
        int right = DFS(node.right, (sum*10)+node.val); // right sum

        return left + right;
    }
}
