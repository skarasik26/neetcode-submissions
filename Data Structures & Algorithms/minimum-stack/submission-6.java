class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        st.push(val);
        if(min.isEmpty()) min.push(val);
        else if(val <= min.peek()) min.push(val);
    }
    
    public void pop() {
        if(st.pop().equals(min.peek())) min.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
