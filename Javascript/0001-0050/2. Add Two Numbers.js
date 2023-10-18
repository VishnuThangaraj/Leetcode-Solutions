// https://leetcode.com/problems/add-two-numbers/

var addTwoNumbers = function(l1, l2) {
    result = new ListNode(0);
    resultHead = result;

    let sum =0 ;
    let carry = 0;

    //add two listNodes
    while(l1 != null && l2 != null){
        sum = l1.val + l2.val + carry;
        carry = 0; //carry set to zero

        if(sum > 9){
            carry = Math.floor(sum/10);
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
            carry = Math.floor(sum/10);
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
            carry = Math.floor(sum/10);
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
};
