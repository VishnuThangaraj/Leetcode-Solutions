# https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/

# https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/solutions/4543927/o-n-java-python-javascript-typescript-c-c-binary-tree/

class Solution:   
    def maxAncestorDiff(self, root: Optional[TreeNode]) -> int:
        if root == None:
            return 0
        self.result = 0

        def FindDifference (self, node, minValue, maxValue):
            if node == None:
                return

            self.result = max(self.result, max(abs(minValue-node.val), abs(maxValue-node.val)))

            minValue = min(minValue, node.val)
            maxValue = max(maxValue, node.val)
            
            FindDifference(self, node.left, minValue, maxValue)
            FindDifference(self, node.right, minValue, maxValue)
        

        # function(root, minValue, maxValue) Root will be the min and max value
        FindDifference(self, root, root.val, root.val)
        return self.result   
