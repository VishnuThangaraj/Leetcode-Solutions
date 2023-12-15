# https://leetcode.com/problems/destination-city/

class Solution:
    def destCity(self, paths: List[List[str]]) -> str:
        if len(paths) == 1:
            return paths[0][1]

        destination = paths[0][1]
        storage = {}
        
        for path in paths: # add all paths and destination to map
            storage[path[0]] = path[1]

        while(destination in storage):
            destination = storage[destination]

        return destination
