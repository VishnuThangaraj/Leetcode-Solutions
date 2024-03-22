# https://leetcode.com/problems/palindrome-linked-list/

class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        if head == None or head.next == None:
            return True

        def findMid(head): # Function to find Mid of the LinkedList
            fast, slow = head, head

            while fast != None and fast.next != None:
                slow = slow.next
                fast = fast.next.next

            return slow;

        def reverseList(Mid): # Function to reverse LinkedList
            current, previous, next = Mid, None, Mid.next

            while current != None:
                current.next = previous
                previous = current
                current = next
                next = next.next if (next!=None) else None

            return previous

        start, tail = head, reverseList(findMid(head))

        while tail != None and start != tail: # Palindrome Check
            if start.val != tail.val:
                return False # Not a palindrome
            start = start.next
            tail = tail.next

        return True # LinkedList is a palindrome
