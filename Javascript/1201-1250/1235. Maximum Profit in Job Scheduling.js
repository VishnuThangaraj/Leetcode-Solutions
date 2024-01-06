// https://leetcode.com/problems/maximum-profit-in-job-scheduling/

// https://leetcode.com/problems/maximum-profit-in-job-scheduling/solutions/4515493/o-n-logn-java-python-javascript-dynamic-programming-binary-search/

/**
 * @param {number[]} startTime
 * @param {number[]} endTime
 * @param {number[]} profit
 * @return {number}
 */
var jobScheduling = function(startTime, endTime, profit) {
    const jobCount = profit.length; // Total number of Jobs
    const jobs = new Array(jobCount);

    for(let index=0; index<jobCount; index++)
        jobs[index] = [startTime[index], endTime[index], profit[index]];

    // Sort the array on basis on EndTime of the Job
    jobs.sort((a,b) => a[1] - b[1]);
    const dp = new Array(jobCount + 1).fill(0);

    for(let index=0; index<jobCount; index++){
        const [start, end, profits] = jobs[index];

        let nonConflictIndex = upperBound(jobs, index, start);
        dp[index+1] = Math.max(dp[index], dp[nonConflictIndex] + profits);
    }

    return dp[jobCount];
};

// Binary Search
var upperBound = function(jobs, endIndex, targetIndex){
    let low = 0;
    let high = endIndex;

    while(low < high){
        let mid = Math.floor((low + high) / 2);
        if(jobs[mid][1] <= targetIndex)
            low = mid + 1;
        else
            high = mid;
    }

    return low;
}
