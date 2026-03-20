class Solution {
    public boolean backspaceCompare(String s, String t) {
      Stack<Character> st = new Stack<>();
      for(int i = 0; i<s.length(); i++){
        char ch = s.charAt(i);
        if(ch == '#'){
            if(!st.isEmpty()){
                st.pop();
         }
        }
        else{
            st.push(ch);
         }
        }

      Stack<Character> tt = new Stack<>();
      for(int i = 0; i<t.length(); i++){
        char ch = t.charAt(i);
            if(ch == '#'){
                if(!tt.isEmpty()){
                    tt.pop();
                }
            }
            else{
                tt.push(ch);
            }
        }
        

      if(st.size() != tt.size()) return false;

      while(!st.isEmpty() && !tt.isEmpty()){
        if(st.peek() != tt.peek()){
            return false;
        }
        st.pop();
        tt.pop();
      }
      return true;
    }
}