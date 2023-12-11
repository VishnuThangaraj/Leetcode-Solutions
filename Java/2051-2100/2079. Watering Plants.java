// https://leetcode.com/problems/watering-plants/

class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps = 0, water = capacity;

        for(int index = 0; index < plants.length; index++){
            if(plants[index] > water){
                steps += (index)*2;
                water = capacity; // Refill water
            }
            water -= plants[index];
            steps++;
        }

        return steps;
    }
}
