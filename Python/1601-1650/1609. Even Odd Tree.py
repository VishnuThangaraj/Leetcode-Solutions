# https://leetcode.com/problems/even-odd-tree/

class Solution:
    def isEvenOddTree(self, root: Optional[TreeNode]) -> bool:
        storage = []
        isOdd = True

        storage.append(root) # Add root to the queue

        while len(storage) > 0:
            size = len(storage)
            previous = -9999999999 if isOdd else 9999999999

            for loop in range(0, size):
                current = storage.pop(0)

                if isOdd:
                    if current.val % 2 == 0 or previous >= current.val:
                        return False
                else:
                    if current.val % 2 != 0 or previous <= current.val:
                        return False
                
                previous = current.val

                # Add left and right childrens to the queue
                if current.left != None:
                    storage.append(current.left)
                if current.right != None:
                    storage.append(current.right)   

            isOdd = False if isOdd else True

        return True
