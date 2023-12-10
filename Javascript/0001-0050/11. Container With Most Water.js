// https://leetcode.com/problems/container-with-most-water/

var maxArea = function(height) {
    let left = 0, right = height.length-1;
    let maxArea = 0;

    while(left < right){
        let currentArea = Math.min(height[left], height[right]) * (right - left);
        maxArea = Math.max(maxArea, currentArea); // update maxArea

        //Update Pointers
        if(height[left] < height[right]) left++;
        else right--;
    }

    return maxArea;
};
