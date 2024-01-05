# https://leetcode.com/problems/longest-increasing-subsequence/

# https://leetcode.com/problems/longest-increasing-subsequence/solutions/4510216/o-n-logn-java-python-javascript-dynamic-programming-binary-search/

class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        tail =tails = [0] * len(nums)
        maxSize = 0 # longest subsequence

        for num in nums:
            start, end = 0, maxSize

            while start != end: # Binary Search
                mid =(start + end) // 2
                if tail[mid] < num:
                    start = mid + 1
                else:
                    end = mid

            tail[start] = num
            maxSize = maxSize+1 if (start == maxSize) else maxSize

        return maxSize
