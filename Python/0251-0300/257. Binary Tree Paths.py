# https://leetcode.com/problems/binary-tree-paths/description/

class Solution:
    def binaryTreePaths(self, root: Optional[TreeNode]) -> List[str]:
        result = []

        def getPaths (node, path):
            if node.left == None and node.right == None:
                result.append(path)
                return
            
            # Get path for left and right nodes
            if node.left != None:
                getPaths(node.left, path+"->"+str(node.left.val))
            if node.right != None:
                getPaths(node.right, path+"->"+str(node.right.val))
        
        
        getPaths(root, str(root.val))
        return result
