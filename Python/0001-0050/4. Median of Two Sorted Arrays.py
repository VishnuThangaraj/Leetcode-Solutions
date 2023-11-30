# https://leetcode.com/problems/median-of-two-sorted-arrays/

class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        # Apply BinarySearch in shorter Array for better time complexity
        num1, num2 = len(nums1), len(nums2)

        if num1 > num2:
            return self.findMedianSortedArrays(nums2, nums1)

        low, high, left = 0, num1, (num1 + num2 + 1) // 2
        oddSizeArray = True if ((num1+num2) % 2 != 0) else False

        # Binary Search
        while low <= high :
            mid1 = (low + high) // 2
            mid2 = left - mid1

            left1 = -sys.maxsize if (mid1-1 < 0) else nums1[mid1 - 1]
            left2 = -sys.maxsize if (mid2-1 < 0) else nums2[mid2 - 1]
            right1 = sys.maxsize if (mid1 >= num1) else nums1[mid1]
            right2 = sys.maxsize if (mid2 >= num2) else nums2[mid2]

            if left1 <= right2 and left2 <= right1:
                if oddSizeArray:
                    return max(left1, left2)
                return (max(left1, left2) + min(right1, right2)) / 2

            elif left1 > right2 :
                high = mid1 - 1
            else :
                low = mid1 + 1

        return 1.0 # Dummy return
