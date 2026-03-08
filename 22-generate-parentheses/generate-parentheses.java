class Solution {
    public List<String> generateParenthesis(int n) {
        int oc = 0;
        int cc = 0;
        List<String> result = new ArrayList<>();

        solve(n, result, oc, cc, "");
        return result;
    }
        
    private void solve(int n, List<String> result, int oc, int cc, String s){

        //Base case
        if(oc == n && cc == n){
            result.add(new String(s));
            return;
        }

        if(oc < n){
            solve(n, result, oc + 1, cc, s+"(");
        }

        if(cc < oc){
            solve(n, result, oc, cc + 1, s+")");
        }
    }
        
}