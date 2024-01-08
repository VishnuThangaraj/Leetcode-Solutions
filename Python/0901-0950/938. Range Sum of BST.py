# https://leetcode.com/problems/range-sum-of-bst/

# https://leetcode.com/problems/range-sum-of-bst/solutions/4526122/o-n-java-python-javascript-typescript-c-c-binary-search-tree/

class Solution:
    def rangeSumBST(self, root: Optional[TreeNode], low: int, high: int) -> int:
        if root == None:
            return 0

        if root.val < low:
            return self.rangeSumBST(root.right, low, high)
        elif root.val > high:
            return self.rangeSumBST(root.left, low, high)

        return root.val + self.rangeSumBST(root.right, low, high)+self.rangeSumBST(root.left, low, high)
