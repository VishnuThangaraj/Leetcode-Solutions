# https://leetcode.com/problems/minimum-common-value/description/

class Solution:
    def getCommon(self, nums1: List[int], nums2: List[int]) -> int:
        first, second = 0, 0 # Two-Pointer

        while first < len(nums1) and second < len(nums2) :
            if nums1[first] == nums2[second]:
                return nums1[first] # common value
            elif nums1[first] < nums2[second]:
                first += 1
            else:
                second += 1

        return -1 # No Common value found
