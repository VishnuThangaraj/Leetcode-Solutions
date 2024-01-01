// https://leetcode.com/problems/assign-cookies/

var findContentChildren = function(g, s) {
    g.sort((a, b) => a-b);
    s.sort((a, b) => a-b);

    let kid = 0, cookie = 0, satisfied = 0;
    
    while(kid < g.length && cookie < s.length){
        if(g[kid] <= s[cookie]){
            satisfied++;kid++;
        }
        cookie++;
    }

    return satisfied;
};
