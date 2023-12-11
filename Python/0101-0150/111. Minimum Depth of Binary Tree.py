# https://leetcode.com/problems/minimum-depth-of-binary-tree/description/

class Solution:
    def minDepth(self, root: Optional[TreeNode]) -> int:
        if root == None:
            return 0
        if root.left == None and root.right == None:
            return 1

        left = self.minDepth(root.left) if (root.left != None) else 9999
        right = self.minDepth(root.right) if (root.right != None) else 9999

        return min(left, right)+1
