class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }
            else{
                if(!st.isEmpty() && Math.abs(st.peek() - ch) == 32){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
        }

        char[] res = new char[st.size()];
        for(int i = res.length - 1; i>=0; i--){
            res[i] = st.pop();
        }
        String Fres = new String(res);
        return Fres;
    }
}