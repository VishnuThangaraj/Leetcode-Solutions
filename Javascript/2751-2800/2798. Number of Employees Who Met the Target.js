// https://leetcode.com/problems/number-of-employees-who-met-the-target/

var numberOfEmployeesWhoMetTarget = function(hours, target) {
    let empCount = 0;

    for(let empHours of hours)
        if(empHours >= target)
            empCount ++;

    return empCount;
};
