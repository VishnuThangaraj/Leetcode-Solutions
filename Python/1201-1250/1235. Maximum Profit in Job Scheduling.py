# https://leetcode.com/problems/maximum-profit-in-job-scheduling/

# https://leetcode.com/problems/maximum-profit-in-job-scheduling/solutions/4515493/o-n-logn-java-python-javascript-dynamic-programming-binary-search/

class Solution:
    def jobScheduling(self, startTime: List[int], endTime: List[int], profit: List[int]) -> int:
        jobs = sorted(zip(endTime, startTime, profit))
      
        number_of_jobs = len(profit)
      
        dp = [0] * (number_of_jobs + 1)
      
        for i, (current_end_time, current_start_time, current_profit) in enumerate(jobs):
            index = bisect_right(jobs, current_start_time, hi=i, key=lambda x: x[0])
            dp[i + 1] = max(dp[i], dp[index] + current_profit)
      
        return dp[number_of_jobs]
