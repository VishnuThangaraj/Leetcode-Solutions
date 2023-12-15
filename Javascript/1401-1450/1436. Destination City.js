// https://leetcode.com/problems/destination-city/

var destCity = function(paths) {
    if(paths.length == 1) return paths[0][1];

    let destination = paths[0][1];
    const storage = new Map();
    
    for(const path of paths) // add all paths and destination to map
        storage.set(path[0],path[1]);

    while(storage.has(destination))
        destination = storage.get(destination);

    return destination;
};
