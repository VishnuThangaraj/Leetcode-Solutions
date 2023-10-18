// https://leetcode.com/problems/two-sum/description/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        //store all value and index in HashMap
        HashMap<Integer, Integer> storage = new HashMap<>();

        int [] result = new int[2];
        //iterate the array to find the result 
        for(int index=0; index<nums.length; index++){
          if(storage.containsKey( target - nums[index])){
              result[0] = index;
              result[1] = storage.get(target - nums[index]);
          }
          //add the value to hashMap
          storage.put(nums[index],index);
        }

        return result;
    }
}
