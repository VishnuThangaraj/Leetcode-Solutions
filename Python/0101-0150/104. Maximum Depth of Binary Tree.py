# https://leetcode.com/problems/maximum-depth-of-binary-tree/description/

class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:

        def findDepth(root):
            if root == None:
                return 0

            # first left and then right
            left = findDepth(root.left)
            right = findDepth(root.right)

            height = left + right + 1

            return max(left,right)+1

        return findDepth(root)
