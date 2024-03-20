# https://leetcode.com/problems/merge-in-between-linked-lists/

class Solution:
    def mergeInBetween(self, list1: ListNode, a: int, b: int, list2: ListNode) -> ListNode:
        current = list1

        # Get the end of the second list 
        end = list2
        while end!= None and end.next != None:
            end = end.next

        # Move the current node 'A' times
        for loop in range(1,a):
            current = current.next

        temp = current.next 
        current.next = list2 # Join the list2

        # Move the current node 'B' times
        for loop in range(a,b):
            temp = temp.next

        end.next = temp.next # Join the 'B' position to end of list2
        temp.next = None

        return list1
