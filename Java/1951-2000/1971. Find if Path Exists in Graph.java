// https://leetcode.com/problems/find-if-path-exists-in-graph/

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<n; i++) graph.add(new ArrayList<>()); // Populate Graph

        // Create Graph
        for(int index=0; index<edges.length; index++){
            graph.get(edges[index][0]).add(edges[index][1]);
             graph.get(edges[index][1]).add(edges[index][0]);
        }

        Queue<Integer> storage = new LinkedList<>(); storage.offer(source);
        HashSet<Integer> visited = new HashSet<>();  visited.add(source);

        while(!storage.isEmpty()){

            int current = storage.poll();
            if(current == destination) return true; // Destination found

            for(int nbrs : graph.get(current)){
                if(!visited.contains(nbrs)){
                    visited.add(nbrs);
                    storage.offer(nbrs); // add neighbours to queue and mark as visited
                }
            }
        }

        return false; // Destination not found
    }
}
