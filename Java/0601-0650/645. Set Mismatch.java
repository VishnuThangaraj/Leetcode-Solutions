// https://leetcode.com/problems/set-mismatch/

// https://leetcode.com/problems/set-mismatch/solutions/4606322/on-on-java-python-javascript-typescript-c-c-frequency-calculation/

class Solution {
    public int[] findErrorNums(int[] nums) {
        int repeat = -1, missing = -1;
        int[] storage = new int[nums.length+1];

        for(int num : nums)
            storage[num]++; // store the frequency

        for(int index=1; index<storage.length; index++)
            if(storage[index] == 0) missing = index; // missing element
            else if(storage[index]>1) repeat = index; // repeated element

        return new int[] {repeat,missing};
    }
}
