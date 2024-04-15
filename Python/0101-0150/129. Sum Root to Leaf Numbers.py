# https://leetcode.com/problems/sum-root-to-leaf-numbers/

class Solution:
    def sumNumbers(self, root: Optional[TreeNode]) -> int:
        def DFS (node, sum):
            if node == None:
                return 0 # null node
            # leaf node found 
            if node.left == None and node.right == None:
                return (sum*10)+node.val

            left = DFS(node.left, (sum*10)+node.val) # left sum
            right = DFS(node.right, (sum*10)+node.val) # right sum

            return left + right

        return DFS(root, 0)
