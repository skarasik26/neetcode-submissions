class MinStack {
    Stack<Integer> st;
    Stack<Integer> min;
    
    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
        min.push(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
        st.push(val);
        if (val <= min.peek()) min.push(val);
    }
    
    public void pop() {
        if(st.peek().equals(min.peek())) {
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
