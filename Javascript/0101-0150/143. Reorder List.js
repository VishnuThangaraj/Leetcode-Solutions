// https://leetcode.com/problems/reorder-list/

var reorderList = function(head) {

    // Function to find the mid of the linkedList
    var findMid = function(head){
        let fast = head, slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Function to reverse LinkedList
    var reverseList = function (Mid){
        let current = Mid, previous = null, next = current.next;

        while(current != null){
            current.next = previous;
            previous = current;
            current = next;
            next = (next!=null) ? next.next : null;
        }

        return previous;
    }

    if(head == null || head.next == null) return;

    // Reverse from the Mid of the List
    let start = head, tail = reverseList(findMid(head));

    let startNext = null, tailNext = null;
    while(start != null && tail != null){

        startNext = start.next;
        start.next = tail;

        tailNext = tail.next;
        tail.next = (startNext == tail) ? null : startNext;

        start = startNext; tail = tailNext;
    }

};
