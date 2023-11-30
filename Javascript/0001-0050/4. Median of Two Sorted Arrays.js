// https://leetcode.com/problems/median-of-two-sorted-arrays/

var findMedianSortedArrays = function(nums1, nums2) {
    // Apply BinarySearch in shorter Array for better time complexity
    const num1 = nums1.length, num2 = nums2.length;
    if(num1 > num2)
        return findMedianSortedArrays(nums2, nums1);

    let low = 0, high = nums1.length;
    let left = Math.floor((num1 + num2 + 1) / 2);
    const oddSizeArray = ((num1 + num2) % 2 != 0) ? true : false;

    while(low <= high){
        let mid1 = Math.floor((low + high) / 2), mid2 = left - mid1;

        const left1 = (mid1-1 >= 0) ? nums1[mid1-1] : Number.MIN_SAFE_INTEGER;
        const left2 = (mid2-1 >= 0) ? nums2[mid2-1] : Number.MIN_SAFE_INTEGER;
        const right1 = (mid1 < num1) ? nums1[mid1] : Number.MAX_SAFE_INTEGER;
        const right2 = (mid2 < num2) ? nums2[mid2] : Number.MAX_SAFE_INTEGER;

        if(left1 <= right2 && left2 <= right1){
            // return mid if odd size of array
            if(oddSizeArray) return Math.max(left1, left2);
            // if even
            return (Math.max(left1, left2) + Math.min(right1, right2)) / 2;
        }
        else if(left1 > right2){
            high = mid1 - 1;
        }
        else{
            low = mid1 + 1;
        }
    }

    return 1.0; // Dummy return
};
