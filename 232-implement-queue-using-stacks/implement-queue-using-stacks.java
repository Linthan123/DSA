class MyQueue {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> t = new Stack<>();

    public MyQueue() { }  //Constuctor -> not requires
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        while(st.size() > 1){
            t.push(st.pop());
        }
        int x =  st.pop();
        while(!t.isEmpty()) st.push(t.pop());
        return x;
    }
    
    public int peek() {
        while(st.size() > 1){
            t.push(st.pop());
        }
        int x =  st.peek();
        while(!t.isEmpty()) st.push(t.pop());
        return x;
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */