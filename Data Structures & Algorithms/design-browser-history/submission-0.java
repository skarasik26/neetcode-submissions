class BrowserHistory {
    class Node{
        String val;
        Node next;
        Node prev;
        public Node(String val){
            this.val = val;
        }
    }
    Node head;
    Node cur;

    public BrowserHistory(String homepage) {
        head = new Node(homepage);
        cur = head;
    }
    
    public void visit(String url) {
        Node temp = new Node(url);
        cur.next = temp;
        temp.prev = cur;
        cur = temp;

    }
    
    public String back(int steps) {
        while(steps > 0 && cur.prev != null){
            cur = cur.prev;
            steps--;
        }
        return cur.val;
    }
    
    public String forward(int steps) {
        while(steps > 0 && cur.next != null){
            cur = cur.next;
            steps--;
        }
        return cur.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */