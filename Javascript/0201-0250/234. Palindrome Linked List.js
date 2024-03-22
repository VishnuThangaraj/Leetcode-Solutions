// https://leetcode.com/problems/palindrome-linked-list/

// Function to find the mid of the linkedList
var findMid = function (head){
    let fast = head, slow = head;

    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }

    return slow;
}
// Function to reverse LinkedList
var reverseList = function(Mid){
    let current = Mid, previous = null, next = current.next;

    while(current != null){
        current.next = previous;
        previous = current;
        current = next;
        next = (next!=null) ? next.next : null;
    }

    return previous;
}
var isPalindrome = function(head) {
    if(head == null || head.next == null) return true;

    let start = head, tail = reverseList(findMid(head));

    while(tail != null && start != tail){ // Palindrome Check
        if(start.val != tail.val) return false; // Not a palindrome
        start = start.next;
        tail = tail.next;
    }

    return true; // LinkedList is a palindrome
};
