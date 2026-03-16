class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        int n = s.length();

        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }
            else{  //check for closing Parentheses
                 
                if(st.isEmpty()) return false;

                char top = st.peek();
                
                if(c == ')' && top != '(') return false;
                if(c == '}' && top != '{') return false;
                if(c == ']' && top != '[') return false;

                st.pop();
            }
        }
        if(st.size() > 0) return false;
        // return st.isEmpty();
        return true;
    }
}