# https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/?envType=study-plan-v2&envId=leetcode-75

class Solution:
    def deleteMiddle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head.next == None:
            return None
        
        previous = None
        slow = head
        fast = head

        # Reach the mid node
        while fast != None and fast.next != None:
            previous = slow
            slow = slow.next
            fast = fast.next.next

        # remove the mid node
        previous.next = slow.next

        return head
