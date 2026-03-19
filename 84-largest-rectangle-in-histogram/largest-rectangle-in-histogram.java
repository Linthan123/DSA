class Solution {
    public int largestRectangleArea(int[] heights) {

        /* Slove by using next-smaller-element(nse) and prevoious-smaller-element(pse)*/
        // [2,1,5,6,2,3]
        Stack<Integer> st = new Stack<>();
        int n = heights.length;

        //PSE
        int[] pse = new int[n];
        pse[0] = -1;
        st.push(0);

        for(int i=1; i<=n -1; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i] = -1;
            }
            else{
                pse[i] = st.peek();
            }
            st.push(i);
        }


        // NSE 
        while(!st.isEmpty()) st.pop();
        int[] nse = new int[n];
        nse[n-1] = n;
        st.push(n-1);

        for(int i=n-2; i>=0; i--){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i] = n;
            }
            else{
                nse[i] = st.peek();
            }
            st.push(i);
        }

        //Maximum area of Rectangle
        int Max = -1;
        for(int i=0; i<n; i++){
            int area = heights[i] *(nse[i] - pse[i] -1);
            Max = Math.max(Max, area);
        }
        return Max;

    }
}