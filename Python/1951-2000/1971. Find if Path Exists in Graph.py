# https://leetcode.com/problems/find-if-path-exists-in-graph/

class Solution:
    def validPath(self, n: int, edges: List[List[int]], source: int, destination: int) -> bool:
        graph =[] 
        for i in range(0, n):
            graph.append([]) # Populate Graph

        # Create Graph
        for index in range(0, len(edges)):
            graph[edges[index][0]].append(edges[index][1])
            graph[edges[index][1]].append(edges[index][0])

        storage, visited = [source], {source}

        while(len(storage) > 0):

            current = storage.pop()
            if current == destination:
                return True # Destination found

            for nbrs in graph[current]:
                if nbrs not in visited:
                    visited.add(nbrs)
                    storage.append(nbrs) # add neighbours to queue and mark as visited

        return False # Destination not found
