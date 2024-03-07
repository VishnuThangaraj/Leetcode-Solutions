# https://leetcode.com/problems/middle-of-the-linked-list/

class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        primary, secondary = head, head

        while secondary != None and secondary.next != None:
            primary = primary.next # move one step
            secondary = secondary.next.next # move two step

        # Now Secondary Node will be on end and Primary Node will be on the Mid.

        return primary
