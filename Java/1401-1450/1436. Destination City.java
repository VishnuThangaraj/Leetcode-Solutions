// https://leetcode.com/problems/destination-city/

class Solution {
    public String destCity(List<List<String>> paths) {
        if(paths.size() == 1) return paths.get(0).get(1);

        String destination = paths.get(0).get(0);
        HashMap<String,String> storage = new HashMap<>();
        
        for(List<String> place : paths) // add all paths and destination to map
            storage.put(place.get(0),place.get(1));

        while(storage.containsKey(destination))
            destination = storage.get(destination);

        return destination;
    }
}
