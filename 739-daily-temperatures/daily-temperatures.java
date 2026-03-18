class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> st = new Stack<>();
        int n = temp.length;
        int[] res = new int[n];

        //last last indices
        res[n-1] = 0;
        st.push(n-1);

        //Traversal from Right to left
        for(int i = n-2; i>=0; i--){
            while(!st.isEmpty() && temp[st.peek()] <= temp[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i] = 0;
            }
            else{
                res[i] = st.peek() - i;
            }
            st.push(i);
        }
        return res;
    }
}