// https://leetcode.com/problems/sliding-window-maximum/

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int size = nums.length;
        int[] result = new int[size-k+1];
        Deque<Integer> storage = new ArrayDeque<>();

        // Add K length elements to Dequeue
        for(int index=0; index<k; index++){
            while(!storage.isEmpty() && nums[index] >= nums[storage.peekLast()])
                storage.pollLast();
                storage.offerLast(index);
        }

        // Sliding Window
        int resultIndex = 0;
        for(int index=k; index<size; index++){
            result[resultIndex++] = nums[storage.peekFirst()];

            // Remove Elements out of the window range
            while(!storage.isEmpty() && storage.peekFirst() < index-k+1)
                storage.pollFirst();

            // Remove Smaller Elements than the current num form the End of Deque
            while(!storage.isEmpty() && nums[index] >= nums[storage.peekLast()])
                storage.pollLast();
            
            storage.offerLast(index);
        }

        result[resultIndex] = nums[storage.peekFirst()];
        return result;
    }
}
