# https://leetcode.com/problems/invert-binary-tree/

class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        def reverse(root):
            # dfs will be used LEFT,RIGHT,ROOT
            if root == None:
                return None
            
            # reach left first , then right
            left = reverse(root.left)
            right = reverse(root.right)

            # swapping occurs
            root.left = right
            root.right = left

            return root

        return reverse(root)
        
