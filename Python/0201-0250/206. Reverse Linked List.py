# https://leetcode.com/problems/reverse-linked-list/description/

class Solution:
    def reverseList(self, head: Optional[ListNode])  -> Optional[ListNode]:
        if head == None or head.next == None :
            return head # if one or no nodes in list
        
        # using 3 pointers
        previous = None
        current = head
        nexts = current.next

        while current != None :
            current.next = previous #  point current to backwards
            previous = current # move previous one step
            current = nexts # move current one step
            if nexts!=None :
                nexts = nexts.next
            
        return previous
