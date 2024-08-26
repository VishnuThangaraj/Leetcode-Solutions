// https://leetcode.com/problems/n-ary-tree-postorder-traversal/

class Solution {
    public List<Integer> postorder(Node root) {
        // If the root is null, return empty arraylist
        if(root == null) return new ArrayList<>();

        List<Integer> result = new ArrayList<>();

        DFS(root, result);

        return result;
    }

    // Recursive Depth First Search
    public void DFS(Node node, List<Integer> result){

        // Recursive Calls for children
        for(Node child : node.children){
            DFS(child, result);
        }

        // add the parent node value at the end
        result.add(node.val);
    }
}
