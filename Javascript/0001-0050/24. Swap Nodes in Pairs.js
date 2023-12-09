// https://leetcode.com/problems/swap-nodes-in-pairs/description/

var swapPairs = function(head) {
    if(head == null || head.next == null)
        return head;

    previous = null;
    current = head;
    next = head.next;

    while(next != null){
        current.next = next.next;
        next.next = current;
        if(previous == null){
            head = next;
        }else{
            previous.next = next;
        }

        // Move nodes
        previous = current;
        current = previous.next;
        if(current == null){
            break;
        }
        next = current.next;
        
    }

    return head;
};
