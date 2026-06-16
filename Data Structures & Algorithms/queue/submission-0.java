class Deque {
    private class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val){
            this.val = val;
            next = null;
            prev = null;
        }
    }
    Node head;
    Node tail;
    public Deque() {

    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void append(int value) {
        Node temp = new Node(value);
        if(tail == null){
            head = tail = temp;
        }else{
        tail.next = temp;
        temp.prev = tail;
        tail = tail.next;
        }
    }

    public void appendleft(int value) {
        Node temp = new Node(value);
        if(head == null){
            head = tail = temp;
        }else{
        temp.next = head;
        head.prev = temp;
        head = temp;
        }
    }

    public int pop() {
        if(this.isEmpty()){
            return -1;
        }
        if(head == tail){
            Node temp = head;
            head = null;
            tail = null;
            return temp.val;
        }
        Node temp = tail;
        tail.prev.next = null;
        tail = tail.prev;
        return temp.val;
    }

    public int popleft() {
        if(this.isEmpty()){
            return -1;
        }
        if(head == tail){
            Node temp = head;
            head = null;
            tail = null;
            return temp.val;
        }
        Node temp = head;
        head.next.prev = null;
        head = head.next;
        return temp.val;
    }
}
