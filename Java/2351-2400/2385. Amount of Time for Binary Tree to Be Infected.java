// https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected/

// https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected/solutions/4538708/o-n-java-python-javascript-typescript-c-c-binary-tree/

class Solution {
    private int result;

    public int amountOfTime(TreeNode root, int start) {
        DFS(root, start);
        return result;
    }

    private int DFS(TreeNode node, int start){
        if(node == null) return 0;

        int leftDepth = DFS(node.left, start);
        int rightDepth = DFS(node.right, start);

        if(node.val == start){
            result = Math.max(leftDepth, rightDepth);
            return -1;
        }
        else if(leftDepth >= 0 && rightDepth >= 0)
            return Math.max(leftDepth, rightDepth)+1;
        
        result = Math.max(result, Math.abs(leftDepth - rightDepth));
        return Math.min(leftDepth, rightDepth) - 1;
    }
}
