# https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75

class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        result = []

        # find the student with max candies
        max = 0
        for index in range(0, len(candies)):
            if max < candies[index]:
                max = candies[index]

        for index in range(0, len(candies)):
            if (extraCandies+candies[index]) >= max:
                result.append(True)
            else:
                result.append(False)
        
        return result
        
