# https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None: # head is empty return head
            return head

        temp = head # create temp node to traverse

        while temp.next!=None: # if next is not null
            if temp.val == temp.next.val:
                temp.next = temp.next.next # if value same point to next node 
            else:
                temp = temp.next # move ahead
                
        return head
