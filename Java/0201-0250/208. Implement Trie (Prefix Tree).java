// https://leetcode.com/problems/implement-trie-prefix-tree/

class Trie {
    static class TrieNode{
        TrieNode[] children = new TrieNode[26];
        boolean isLeaf = false;
    }
    TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode current = root;
        for(int i=0; i<word.length(); i++){
            //get numerical index
            int index = word.charAt(i)-'a';
            // check if children is already present 
            if(current.children[index] == null){
                // create New Node
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        // Mark last node as lead
        current.isLeaf = true;
    }
    
    public boolean search(String word) {
        TrieNode current = root;
        for(int i=0; i<word.length(); i++){
            // Get the index
            int index = word.charAt(i)-'a';
            if(current.children[index] == null) return false;

            current = current.children[index];
        }
        if(current.isLeaf) return true;
        return false;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for(int i=0; i<prefix.length(); i++){
            // Get the index
            int index = prefix.charAt(i)-'a';
            if(current.children[index] == null) return false;

            current = current.children[index];
        }
        
        return true;
    }
}
