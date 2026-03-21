class MinStack {
    Stack<Integer> st = new Stack<>(); //Not consider as extra space beacuse its required to init the vals
    Stack<Integer> min = new Stack<>();   //Using Extra space O(n)
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(st.isEmpty() && min.isEmpty()){
            st.push(val);
            min.push(val);
        }else{
            st.push(val);
            if(min.peek() < val){
                min.push(min.peek());
            }
            else{
                min.push(val);
            }
        }
    }
    
    public void pop() {
        st.pop();
        min.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */