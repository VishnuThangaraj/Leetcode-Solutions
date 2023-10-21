# https://leetcode.com/problems/same-tree/description/

class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        if p == None and q == None:
            return True #reached end (or) empty tree

        if p == None or q == None:
            return False; # any one of the node becomes None

        # check current node value
        if p.val != q.val:
            return False # value not-matching

        # check for left and right sides
        return self.isSameTree(p.left,q.left) and self.isSameTree(p.right,q.right)
