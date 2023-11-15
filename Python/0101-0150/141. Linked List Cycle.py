# https://leetcode.com/problems/linked-list-cycle/

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        fast = head
        slow = head

        while fast != None and fast.next != None: # runs untill the fast reaches null
            slow = slow.next
            fast = fast.next.next
            if fast == slow: # both meets so its a cycle
                return True

        return False
   
