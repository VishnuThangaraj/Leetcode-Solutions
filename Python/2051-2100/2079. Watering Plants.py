# https://leetcode.com/problems/watering-plants/

class Solution:
    def wateringPlants(self, plants: List[int], capacity: int) -> int:
        steps, water = 0, capacity

        for index in range(0,len(plants)):
            if(plants[index] > water):
                steps += (index)*2
                water = capacity; # Refill water
            
            water -= plants[index]
            steps += 1

        return steps
