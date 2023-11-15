// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

var findMin = function(nums) {
    // Single elemnet in the array 
    if(nums.length == 1) return nums[0];

    let start = 0, end = nums.length-1;

    while(start <= end){
        const mid = start + Math.floor((end - start)/2);

        // Min element in end of the array
        if(mid == nums.length-1){
            if(nums[mid] < nums[mid-1])
                return nums[mid]; // Last Element in the array is the minimum
            else
                end = mid-1;
        }
        else if(mid == 0){
            if(nums[mid] < nums[mid+1])
                return nums[mid]; // First Element in the array is minimum
            else
                start = mid+1;
        }
        else{
            if(nums[mid] < nums[mid-1] && nums[mid] < nums[mid+1])
                return nums[mid];
            else if (nums[start] <= nums[end]) // Sorted range
                return nums[start];
            else{ // un-sorted Range
                if(nums[start] <= nums[mid])
                    start = mid+1;
                else
                    end = mid-1;
            }       
        } 
    }
    return end;
};
