# https://leetcode.com/problems/boats-to-save-people/

class Solution(object):
    def numRescueBoats(self, people, limit):
        people.sort()

        first, second, result = 0, len(people)-1, 0

        while first <= second:
            weight = people[first] + people[second]
            
            first += 1 if (weight <= limit) else 0
            second -= 1
            result += 1

        return result
        
