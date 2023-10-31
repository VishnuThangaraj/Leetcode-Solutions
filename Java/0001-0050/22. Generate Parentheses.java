// https://leetcode.com/problems/generate-parentheses/description/

class Solution {
    public void generateRecursively(List<String> result,int n, int opening, int closing, String current){
        if(current.length() == n*2){
            result.add(current);
            return;
        }

        // Recursive calls
        if(opening < n){
            generateRecursively(result,n, opening+1, closing, current+"(");
        }
        if(closing < opening){
            generateRecursively(result,n, opening, closing+1, current+")");
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateRecursively(result, n, 0, 0, "");
        return result;
    }
}
