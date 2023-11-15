# https://leetcode.com/problems/merge-k-sorted-lists/description/

class Solution:
    # lets use iterative approach to solve this problem
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        if len(lists) == 1: # no need to sort single list
            return lists[0]

        # result array to sorted nodes
        sorted = ListNode(-10000)

        # iterate through all the listNodes
        for index in range(0, len(lists)):
            dummy = sorted
            original = lists[index]

            # result for current merge
            result = ListNode(-1)
            resultHead = result

            # merge both listNodes like using merge sort
            while dummy != None and original != None:
                if dummy.val < original.val:
                    result.next = dummy
                    dummy = dummy.next
                else:
                    result.next = original
                    original = original.next
                result = result.next

            # add the remaining nodes
            result.next = dummy if dummy != None else original

            # add the sorted result to sorted ListNode
            sorted = resultHead.next
        
        return sorted.next;
