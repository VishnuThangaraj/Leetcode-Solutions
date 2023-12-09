// https://leetcode.com/problems/swap-nodes-in-pairs/description/

class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next==null){
            return head;
        }
        
        ListNode previous = null;
        ListNode current = head;
        ListNode next = head.next;

        while(next!=null){
            current.next = next.next;
            next.next = current;
            if(previous==null){
                head = next;
            }else{
                previous.next = next;
            }

            //move nodes
            previous = current;
            current = previous.next;
            if(current==null){
                break;
            }
            next = current.next;

        }
        return head;
    }
}
