// https://leetcode.com/problems/middle-of-the-linked-list/

var middleNode = function(head) {
    // Fast and slow Nodes
    let primary = head, secondary = head;

    while(secondary != null && secondary.next != null){
        primary = primary.next; // move one step
        secondary = secondary.next.next; // move two step
    }

    // Now Secondary Node will be on end and Primary Node will be on the Mid.

    return primary;
};
