// https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){ //head is empty return head
            return head;
        }

        ListNode temp = head; //create temp node to traverse

        while(temp.next!=null){ //if next is not null
            if(temp.val == temp.next.val){ 
                temp.next = temp.next.next; //if value same point to next node 
            }else{
                temp = temp.next; //move ahead
            }
        }

        return head;
    }
}
