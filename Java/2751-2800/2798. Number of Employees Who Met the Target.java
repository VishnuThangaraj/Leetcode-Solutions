// https://leetcode.com/problems/number-of-employees-who-met-the-target/

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int empCount = 0;

        for(int empHours : hours)
            if(empHours >= target)
                empCount ++;

        return empCount;
    }
}
