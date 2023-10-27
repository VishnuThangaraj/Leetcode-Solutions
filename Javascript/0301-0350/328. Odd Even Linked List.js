// https://leetcode.com/problems/odd-even-linked-list/description/?envType=study-plan-v2&envId=leetcode-75

var oddEvenList = function(head) {
    if(head==null || head.next == null) return head;

    odd = head;
    even = head.next;
    evenHead = even;

    while(odd.next != null && even.next!=null){
        odd.next = even.next;
        odd = odd.next;
        even.next = odd.next;
        even = even.next;
    }
    odd.next = evenHead;

    return head;
};
