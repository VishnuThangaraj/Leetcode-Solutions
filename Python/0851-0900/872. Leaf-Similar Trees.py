# https://leetcode.com/problems/leaf-similar-trees/

# https://leetcode.com/problems/leaf-similar-trees/solutions/4532192/o-n-m-java-python-javascript-typescript-c-c-binary-tree-dfs/?envType=daily-question&envId=2024-01-09

class Solution:
    def leafSimilar(self, root1: Optional[TreeNode], root2: Optional[TreeNode]) -> bool:
        def dfs(node):
            if node is None: # Node is empty
                return []
          
            # Recursively explore the left and right children
            leaves = dfs(node.left) + dfs(node.right)
          
            return leaves or [node.val]

        return dfs(root1) == dfs(root2)
