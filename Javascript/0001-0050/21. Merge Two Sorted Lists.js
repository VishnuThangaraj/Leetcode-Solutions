// https://leetcode.com/problems/merge-two-sorted-lists/description/

var mergeTwoLists = function(list1, list2) {
    mergedNode = new ListNode(); //create new node
    head = mergedNode;

    while(list1 != null && list2 != null){
        if(list1.val <= list2.val){
            mergedNode.next = list1;
            list1 = list1.next;
        }else{
            mergedNode.next = list2;
            list2 = list2.next; 
        }
        mergedNode = mergedNode.next;
    }

    if(list1!=null){
        mergedNode.next = list1;
    }

    if(list2!=null){
        mergedNode.next = list2;
    }

    return head.next;
};
