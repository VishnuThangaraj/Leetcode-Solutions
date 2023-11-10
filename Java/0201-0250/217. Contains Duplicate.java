// https://leetcode.com/problems/contains-duplicate/description/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        //u can sort the array and find the duplicates or use hashset to reduce time complexity
        HashSet<Integer> storage = new HashSet<>();

        //traverse through the given array
        for(int index=0; index<nums.length; index++){
            if(storage.contains(nums[index])){
                return true; //duplicates found
            }
            //add the element to the hashSet
            storage.add(nums[index]);
        }

        return false; //no duplicates found
    }
}
