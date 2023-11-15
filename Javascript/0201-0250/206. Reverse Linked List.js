// https://leetcode.com/problems/reverse-linked-list/description/

var reverseList = function(head) {
    if(head == null || head.next ==null){
        return head; //if one or no nodes in list
    }
    //using 3 pointers
    previous = null;
    current = head;
    next = current.next;

    while(current != null){
        current.next = previous; // point current to backwards
        previous = current; //move previous one step
        current = next; //move current one step
        if(next!=null){
            next = next.next;
        }
    }

    return previous;
};
