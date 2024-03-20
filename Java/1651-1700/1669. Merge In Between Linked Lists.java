// https://leetcode.com/problems/merge-in-between-linked-lists/

class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode current = list1;

        // Get the end of the second list 
        ListNode end = list2;
        while(end!= null && end.next != null) end = end.next;

        // Move the current node 'A' times
        for(int loop=1; loop<a; loop++) current = current.next;

        ListNode temp = current.next; 
        current.next = list2; // Join the list2

        // Move the current node 'B' times
        for(int loop=a;loop<b; loop++) temp = temp.next;

        end.next = temp.next; // Join the 'B' position to end of list2
        temp.next = null;

        return list1;
    }
}
