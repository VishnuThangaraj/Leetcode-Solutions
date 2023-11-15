// https://leetcode.com/problems/linked-list-cycle/

var hasCycle = function(head) {
    fast = head;
    slow = head;

    while(fast != null && fast.next != null){ //runs untill the fast reaches null
        slow = slow.next;
        fast = fast.next.next;
        if(fast == slow){//both meets so its a cycle
            return true;
        }
    }

    return false;
};
