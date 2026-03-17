class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int open = 0;
        int close = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(ch);
            }
            else if (st.isEmpty() || st.peek() == ')'){
               st.push(ch);
            }  
            else{
                    st.pop();
                }
            }
        return st.size();
    }
    
}
