// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/?envType=study-plan-v2&envId=leetcode-75

var deleteMiddle = function(head) {
    if(head.next == null) return null;
        
    previous = null;
    slow = head;
    fast = head;

    // Reach the mid node
    while(fast != null && fast.next != null){
        previous = slow;
        slow = slow.next;
        fast = fast.next.next;
    }

    // remove the mid node
    previous.next = slow.next;

    return head;
};
