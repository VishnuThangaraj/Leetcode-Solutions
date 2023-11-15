// https://leetcode.com/problems/reverse-linked-list/description/

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next ==null){
            return head; //if one or no nodes in list
        }
        //using 3 pointers
        ListNode previous = null;
        ListNode current = head;
        ListNode next = current.next;

        while(current != null){
            current.next = previous; // point current to backwards
            previous = current; //move previous one step
            current = next; //move current one step
            if(next!=null){
                next = next.next;
            }
        }

        return previous;
    }
}
