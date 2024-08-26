# https://leetcode.com/problems/n-ary-tree-postorder-traversal/

class Solution:
    def postorder(self, root: 'Node') -> List[int]:
        # If the root is null, return empty arraylist
        if not root:
            return []

        result = []

        # Recursive Depth First Search
        def DFS(node):
            # Recursive Call for childrens
            for children in node.children:
                DFS(children)
            
            # add the parent node value at the end
            result.append(node.val)

        DFS(root)

        return result
