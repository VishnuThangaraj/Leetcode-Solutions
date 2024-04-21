// https://leetcode.com/problems/find-if-path-exists-in-graph/

var validPath = function(n, edges, source, destination) {
    const graph =[] 
    for(let i=0; i<n; i++) graph.push([]); // Populate Graph

    // Create Graph
    for(let index=0; index<edges.length; index++){
        graph[edges[index][0]].push(edges[index][1]);
        graph[edges[index][1]].push(edges[index][0]);
    }

    const storage = [source];
    const visited = new Set([source]); 

    while(storage.length > 0){

        let current =storage.pop(storage.length-1);
        if(current == destination) return true; // Destination found

        for(let nbrs of graph[current]){
            if(!visited.has(nbrs)){
                visited.add(nbrs);
                storage.push(nbrs); // add neighbours to queue and mark as visited
            }
        }
    }

    return false; // Destination not found
};
