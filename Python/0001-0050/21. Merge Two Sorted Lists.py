# https://leetcode.com/problems/merge-two-sorted-lists/description/

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        mergedNode = ListNode() # create new node
        head = mergedNode

        while list1 != None and list2 != None :
            if(list1.val <= list2.val) :
                mergedNode.next = list1
                list1 = list1.next
            else :
                mergedNode.next = list2
                list2 = list2.next 
            
            mergedNode = mergedNode.next
        

        if list1!=None:
            mergedNode.next = list1
        

        if list2!=None:
            mergedNode.next = list2
        

        return head.next
        
