// https://leetcode.com/problems/jewels-and-stones/

//            1. USING HASHSET            //

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        HashSet<Character> storage = new HashSet<>();

        for(char letter : jewels.toCharArray())
            storage.add(letter);

        for(char letter : stones.toCharArray()){
            if(storage.contains(letter)) count++;
        }

        return count;
    }
}

//          2. USING INDEXOF          //

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        
        for(char stone : stones.toCharArray())
            if(jewels.indexOf(stone) != -1) count++;

        return count;
    }
}
