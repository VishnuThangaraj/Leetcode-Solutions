# https://leetcode.com/problems/number-of-employees-who-met-the-target/

class Solution:
    def numberOfEmployeesWhoMetTarget(self, hours: List[int], target: int) -> int:
        empCount = 0

        for empHours in hours:
            if empHours >= target:
                empCount += 1

        return empCount
