// https://leetcode.com/problems/merge-in-between-linked-lists/

var mergeInBetween = function(list1, a, b, list2) {
    let current = list1;

    // Get the end of the second list 
    let end = list2;
    while(end!= null && end.next != null) end = end.next;

    // Move the current node 'A' times
    for(let loop=1; loop<a; loop++) current = current.next;

    let temp = current.next; 
    current.next = list2; // Join the list2

    // Move the current node 'B' times
    for(let loop=a;loop<b; loop++) temp = temp.next;

    end.next = temp.next; // Join the 'B' position to end of list2
    temp.next = null;

    return list1;
};
