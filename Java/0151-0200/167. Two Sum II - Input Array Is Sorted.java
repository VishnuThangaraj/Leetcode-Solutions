// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/?envType=study-plan-v2&envId=top-interview-150

// ####################### BINARY SEARCH ####################### //
class Solution {
    public int binarySearch(int[] numbers, int start, int end, int target){
        if(start > end)
            return -1;
        
        int mid = start + (end - start) / 2;

        if(numbers[mid] == target) // target found
            return mid;
        
        if(target > numbers[mid])
            // search right region
            return binarySearch(numbers, mid+1, end, target);

        return binarySearch(numbers, start, mid-1, target);
    }
    public int[] twoSum(int[] numbers, int target) {
        int[] result = {-1,-1};

        // Apply binary Search in the Array
        for(int index=0; index<numbers.length; index++){
            result[0] = index+1;
            result[1] = binarySearch(numbers, index+1, numbers.length-1, target - numbers[index])+1;
            if(result[1] != 0) break; // target found
        }

        return result;
    }
}

// ####################### TWO-POINTERS ####################### //

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Two-Pointers
        int first = 0, second = numbers.length - 1;
        while (first < second) {
            if(numbers[first] + numbers[second] == target) // target found
                return new int[] {first+1, second+1};
            else if(numbers[first] + numbers[second] < target)
                first++;
            else
                second--;
        }
        return null;
    } 
}
