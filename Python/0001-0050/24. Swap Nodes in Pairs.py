# https://leetcode.com/problems/swap-nodes-in-pairs/description/

class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None or head.next == None:
            return head

        previous = None
        current = head
        next = current.next

        while next != None:
            # Swap Nodes
            current.next = next.next
            next.next = current
            if previous == None:
                head = next
            else:
                previous.next = next

            # Move Nodes
            previous = current
            current = previous.next
            if current == None:
                break
            next = current.next


        return head
