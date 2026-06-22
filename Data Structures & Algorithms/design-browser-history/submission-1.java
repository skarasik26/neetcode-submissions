class BrowserHistory {
    private class Node{
        String value;
        Node prev;
        Node next;
        public Node(String value){
            this.value = value;
        }
    }
    Node current;
    public BrowserHistory(String homepage) {
        current = new Node(homepage);
    }
    
    public void visit(String url) {
        Node web = new Node(url);
        current.next = web;
        web.prev = current;
        current = web;
    }
    
    public String back(int steps) {
        for(int i = 0; i < steps; i ++){
            if(current.prev == null) return current.value;
            current = current.prev;
        }
        return current.value;
    }
    
    public String forward(int steps) {
        for(int i = 0; i < steps; i ++){
            if(current.next == null) return current.value;
            current = current.next;
        }
        return current.value;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */