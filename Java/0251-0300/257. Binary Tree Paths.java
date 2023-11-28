// https://leetcode.com/problems/binary-tree-paths/description/

class Solution {
    List<String> result = new ArrayList<>();

    public void getPaths(TreeNode node, String path){
        if(node.left == null && node.right == null){
            result.add(path);
            return;
        }

        // Get path for left and right nodes
        if(node.left != null)
            getPaths(node.left, path+"->"+node.left.val);
        if(node.right != null)
            getPaths(node.right, path+"->"+node.right.val);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        getPaths(root, root.val+"");
        return result;
    }
}
