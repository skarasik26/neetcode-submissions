class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> min;
    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if (min.empty() || val <= min.peek()){
            min.push(val);
        }
    }
    
    public void pop() {
        if(st.peek().equals(min.peek())){
            min.pop();
        }
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
