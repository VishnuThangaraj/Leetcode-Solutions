// https://leetcode.com/problems/merge-k-sorted-lists/description/

class Solution {
    //lets use iterative approach to solve this problem
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==1){ // no need to sort single list
            return lists[0];
        }

        //result array to sorted nodes
        ListNode sorted = new ListNode(Integer.MIN_VALUE);

        //iterate through all the listNodes
        for(int index = 0; index < lists.length; index++){
            ListNode dummy = sorted;
            ListNode original = lists[index];

            //result for current merge
            ListNode result = new ListNode(-1);
            ListNode resultHead = result;

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
    }
}
