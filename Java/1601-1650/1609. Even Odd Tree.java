// https://leetcode.com/problems/even-odd-tree/

class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> storage = new LinkedList<>();
        boolean isOdd = true;

        storage.offer(root); // Add root to the queue

        while(!storage.isEmpty()){
            int size = storage.size();
            int previous = (isOdd) ? Integer.MIN_VALUE : Integer.MAX_VALUE;

            for(int loop=0; loop<size; loop++){
                TreeNode current = storage.poll();

                if(isOdd){
                    if(current.val % 2 == 0 || previous >= current.val) return false;
                }else{
                    if(current.val % 2 != 0 || previous <= current.val) return false;
                }

                previous = current.val;
                // Add left and right childrens to the queue
                if(current.left != null) storage.offer(current.left);
                if(current.right != null) storage.offer(current.right);   
            }

            isOdd = !isOdd;
        }

        return true;
    }
}
