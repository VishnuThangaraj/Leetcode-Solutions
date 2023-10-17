// https://leetcode.com/problems/next-greater-element-ii/description/

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];

        // stack to store the index
        Stack<Integer> storage = new Stack<>();

        for(int index = (2*size)-1; index>=0; index--){
            // remove elements less than current from the stack
            while(!storage.isEmpty() && nums[storage.peek()] <= nums[index % size])
                storage.pop();

            if(index < size){
                if(!storage.isEmpty())
                    result[index] = nums[storage.peek()];
                else
                    result[index] = -1; // empty stack
            }

            // add the current index to stack
            storage.push(index%size);
        }
        return result;
    }
}
