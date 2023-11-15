// https://leetcode.com/problems/merge-k-sorted-lists/description/

 //lets use iterative approach to solve this problem
var mergeKLists = function(lists) {
    if(lists.length==1){ // no need to sort single list
            return lists[0];
    }

    //result array to sorted nodes
    sorted = new ListNode(-10000);

    //iterate through all the listNodes
    for(let index = 0; index < lists.length; index++){
        dummy = sorted;
        original = lists[index];

        //result for current merge
        result = new ListNode(-1);
        resultHead = result;

        //merge both listNodes like using merge sort
        while(dummy!=null && original!=null){
            if(dummy.val < original.val){
                result.next = dummy;
                dummy = dummy.next;
            }else{
                result.next = original;
                original = original.next;
            }
            result = result.next;
        }

        //add the remaining nodes
        result.next = (dummy!=null) ? dummy : original;

        //add the sorted result to sorted ListNode
        sorted = resultHead.next;
    }        

    return sorted.next;
};
