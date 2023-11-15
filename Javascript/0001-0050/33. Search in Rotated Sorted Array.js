// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

let binarySearch = function(nums, target, start, end){
    if(start > end) return -1; // Target not found

    const mid = start + Math.floor((end - start)/2); // Mid-postion

    if(nums[mid] == target) return mid; // Target found

    // Check if the range is sorted
    if(nums[start] <= nums[mid]){
        if(nums[start] <= target && nums[mid]>=target)
            return binarySearch(nums, target, start, mid-1); // Search in left range
        else
            return binarySearch(nums, target, mid+1, end); // Search in right range
    }

    // If the range is unsorted
    if(target <=nums[end] && target >= nums[mid])
        return binarySearch(nums,target,mid+1,end);
    else
        return binarySearch(nums,target,start,mid-1);
        
}
var search = function(nums, target) {
    // Recursive Binary Search
    return binarySearch(nums, target, 0, nums.length-1);
};

