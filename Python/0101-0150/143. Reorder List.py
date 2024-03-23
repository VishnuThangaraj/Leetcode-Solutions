# https://leetcode.com/problems/reorder-list/

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        """
        Do not return anything, modify head in-place instead.
        """
        # Function to find the mid of the linkedList
        def findMid (head):
            fast, slow = head, head

            while fast != None and fast.next != None:
                slow = slow.next
                fast = fast.next.next

            return slow

        # Function to reverse LinkedList
        def reverseList (Mid):
            current, previous, next = Mid, None, Mid.next

            while current != None:
                current.next = previous
                previous = current
                current = next
                next = next.next if (next!=None) else None

            return previous

        if head == None or head.next == None:
            return

        # Reverse from the Mid of the List
        start, tail = head, reverseList(findMid(head))

        startNext, tailNext = None, None
        while start != None and tail != None:

            startNext = start.next
            start.next = tail

            tailNext = tail.next
            tail.next = None if (startNext == tail) else startNext

            start = startNext
            tail = tailNext
            
