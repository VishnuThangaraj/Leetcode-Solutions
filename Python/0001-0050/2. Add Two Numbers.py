# https://leetcode.com/problems/add-two-numbers/

class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        result = ListNode(0)
        resultHead = result

        sum = 0
        carry = 0

        # add two listNodes
        while l1 != None and l2 != None:
            sum = l1.val + l2.val + carry
            carry = 0 # carry set to zero

            if sum > 9:
                carry = sum // 10
                sum = sum % 10 

            result.next = ListNode(sum)
            result = result.next
            l1 = l1.next
            l2 = l2.next
        

        # if l1 remains un added due to longer length than l2
        while l1!=None:
            sum = l1.val+ carry
            carry = 0 # carry set to zero

            if sum > 9:
                carry = sum//10
                sum = sum % 10 
            

            result.next = ListNode(sum)
            result = result.next
            l1 = l1.next
        

        # if l1 remains un added due to longer length than l2
        while l2!=None:
            sum = l2.val + carry
            carry = 0 # carry set to zero

            if sum > 9:
                carry = sum//10
                sum = sum % 10 
            

            result.next = ListNode(sum)
            result = result.next
            l2 = l2.next
        

        if carry > 0:
            result.next = ListNode(carry)
            result = result.next
        

        return resultHead.next
        
