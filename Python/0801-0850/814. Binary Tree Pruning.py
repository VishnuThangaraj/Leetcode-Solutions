# https://leetcode.com/problems/binary-tree-pruning/

class Solution:
    def pruneTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if root == None:
            return None

        root.left = self.pruneTree(root.left)
        root.right = self.pruneTree(root.right)

        if root.val == 0 and root.left == None and root.right == None:
            return None

        return root
