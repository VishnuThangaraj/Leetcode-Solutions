// https://leetcode.com/problems/add-two-numbers/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode resultHead = result;

        int sum =0 ;
        int carry = 0;

        //add two listNodes
        while(l1 != null && l2 != null){
            sum = l1.val + l2.val + carry;
            carry = 0; //carry set to zero

            if(sum > 9){
                carry = sum/10;
                sum = sum % 10; 
            }

            result.next = new ListNode(sum);
            result = result.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        //if l1 remains un added due to longer length than l2
        while(l1!=null){
             sum = l1.val+ carry;
             carry = 0; //carry set to zero

            if(sum > 9){
                carry = sum/10;
                sum = sum % 10; 
            }

            result.next = new ListNode(sum);
            result = result.next;
            l1 = l1.next;
        }

        //if l1 remains un added due to longer length than l2
        while(l2!=null){
             sum = l2.val+ carry;
             carry = 0; //carry set to zero

            if(sum > 9){
                carry = sum/10;
                sum = sum % 10; 
            }

            result.next = new ListNode(sum);
            result = result.next;
            l2 = l2.next;
        }

        if(carry > 0){
            result.next = new ListNode(carry);
            result = result.next;
        }

        return resultHead.next;
    }
}
