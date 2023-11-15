// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

class Solution {
    public int search(int[] nums, int target) {
        //recursive binary searching
        return binarySearch(nums,target,0,nums.length-1); 
    }

    public int binarySearch(int[]nums, int target, int start, int end){
        if(start > end){
            return -1; //element not present in the array
        }
        int mid = start + (end - start) / 2; // calculating the mid position

        if(nums[mid] == target){ //target is found and its located in mid..so return mid
            return mid; 
        }

        if(nums[start] <= nums[mid]){ //first half is sorted
            if(target >= nums[start] && target <= nums[mid]){
                return binarySearch(nums,target,start,mid-1);
            }else{
                return binarySearch(nums,target,mid+1,end);
            }
        }
        if(target <=nums[end] && target >= nums[mid]){
           return  binarySearch(nums,target,mid+1,end);
        }else{
            return binarySearch(nums,target,start,mid-1);
        }
    }
}
