class MyStack {
    Queue<Integer> q1 = new ArrayDeque<>();
    Queue<Integer> q2 = new ArrayDeque<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        if(q1.size() == 0) q1.add(x);
        else{
            for(int i : q1){
                q2.add(i);
                q1.remove();
            }
            q1.add(x);
            for(int i : q2){
                q1.add(i);
                q2.remove();
            }
        }
    }
    
    public int pop() {
        return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */