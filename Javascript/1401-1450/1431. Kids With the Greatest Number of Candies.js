// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75

var kidsWithCandies = function(candies, extraCandies) {
    result = [];

    // find the student with max candies
    let max = 0;
    for(let index=0; index<candies.length; index++)
        if(max < candies[index])
            max = candies[index];

    for(let index=0; index<candies.length; index++){
        if((extraCandies+candies[index]) >= max)
            result.push(true);
        else
            result.push(false);
    }
    return result;
};
