// https://leetcode.com/problems/maximum-profit-in-job-scheduling/

// https://leetcode.com/problems/maximum-profit-in-job-scheduling/solutions/4515493/o-n-logn-java-python-javascript-dynamic-programming-binary-search/

class Solution {
    private static class Job{
        int start, end, profit;

        // Constructor
        Job(int start, int end, int profit){
            this.start = start;
            this.end = end;
            this.profit = profit;
        }
    }

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int jobCount = profit.length; // Total number of Jobs
        Job[] jobs = new Job[jobCount];

        for(int index=0; index<jobCount; index++)
            jobs[index] = new Job(startTime[index], endTime[index], profit[index]);

        // Sort the array on basis on EndTime of the Job
        Arrays.sort(jobs, (a,b) -> a.end - b.end);
        int[] dp = new int[jobCount+1];

        for(int index=0; index<jobCount; index++){
            int start = jobs[index].start;
            int end = jobs[index].end;
            int profits = jobs[index].profit;

            int nonConflictIndex = upperBound(jobs, index, start);
            dp[index+1] = Math.max(dp[index], dp[nonConflictIndex] + profits);
        }

        return dp[jobCount];
    }

    // Binary Search
    private int upperBound(Job[] jobs, int endIndex, int targetIndex){
        int low = 0;
        int high = endIndex;

        while(low < high){
            int mid = (low + high) / 2;
            if(jobs[mid].end <= targetIndex)
                low = mid + 1;
            else
                high = mid;
        }

        return low;
    }
}
