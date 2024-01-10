# https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected/

# https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected/solutions/4538708/o-n-java-python-javascript-typescript-c-c-binary-tree/

class Solution:
    def amountOfTime(self, root: Optional[TreeNode], start: int) -> int:
        result = 0

        def DFS(node, start):
            if node == None:
                return 0

            leftDepth = DFS(node.left, start)
            rightDepth = DFS(node.right, start)

            if node.val == start:
                Solution.result = max(leftDepth, rightDepth)
                return -1
            
            elif leftDepth >= 0 and rightDepth >= 0:
                return max(leftDepth, rightDepth)+1
            
            Solution.result = max(Solution.result, abs(leftDepth - rightDepth))
            return min(leftDepth, rightDepth) - 1

        DFS(root, start)
        return Solution.result    
