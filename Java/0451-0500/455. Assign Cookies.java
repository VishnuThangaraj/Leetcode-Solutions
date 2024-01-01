// https://leetcode.com/problems/assign-cookies/

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); Arrays.sort(s);

        int kid = 0, cookie = 0, satisfied = 0;
        
        while(kid < g.length && cookie < s.length){
            if(g[kid] <= s[cookie]){
                satisfied++;kid++;
            }
            cookie++;
        }

        return satisfied;
    }
}
