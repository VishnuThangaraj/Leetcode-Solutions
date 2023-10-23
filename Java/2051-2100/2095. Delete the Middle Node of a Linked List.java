// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;
        
        ListNode previous = null;
        ListNode slow = head;
        ListNode fast = head;

        // Reach the mid node
        while(fast != null && fast.next != null){
            previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // remove the mid node
        previous.next = slow.next;

        return head;
    }
}
