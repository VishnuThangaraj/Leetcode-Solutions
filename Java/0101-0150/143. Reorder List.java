// https://leetcode.com/problems/reorder-list/

class Solution {
    // Function to find the mid of the linkedList
    public ListNode findMid(ListNode head){
        ListNode fast = head, slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Function to reverse LinkedList
    public ListNode reverseList(ListNode Mid){
        ListNode current = Mid, previous = null, next = current.next;

        while(current != null){
            current.next = previous;
            previous = current;
            current = next;
            next = (next!=null) ? next.next : null;
        }

        return previous;
    }

    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;

        // Reverse from the Mid of the List
        ListNode start = head, tail = reverseList(findMid(head));

        ListNode startNext = null, tailNext = null;
        while(start != null && tail != null){

            startNext = start.next;
            start.next = tail;

            tailNext = tail.next;
            tail.next = (startNext == tail) ? null : startNext;

            start = startNext; tail = tailNext;
        }
    }
}
