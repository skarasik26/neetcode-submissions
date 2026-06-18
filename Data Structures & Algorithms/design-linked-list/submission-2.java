class MyLinkedList {
    private class Node {
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            next = null;
        }
    }
    Node head;
    Node tail;
    public MyLinkedList() {
        head = null;
        tail = null;
    }
    
    public int get(int index) {
        Node cur = head;
        int i = 0;
        while(cur != null){
            if (i == index) return cur.val;
            cur = cur.next;
            i++;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        Node temp = new Node(val);
        if(head == null){
            head = tail = temp;
            return;
        }
        temp.next = head;
        head = temp;
    }
    
    public void addAtTail(int val) {
        Node temp = new Node(val);
        if(tail == null) {
            head = tail = temp;
            return;
        }
        tail.next = temp;
        tail = temp;
    }
    
    public void addAtIndex(int index, int val) {
        Node cur = head;
        int i = 0;
        if(index == 0){
            addAtHead(val);
            return;
        }
        while(cur != null){
            if (i + 1 == index){
                Node temp = new Node(val);
                temp.next = cur.next;
                cur.next = temp;
                if(cur.equals(tail)) tail = temp;
                return;

            }
            cur = cur.next;
            i++;
        }
    }
    
    public void deleteAtIndex(int index) {
        Node cur = head;
        int i = 0;
        if (index == 0){
            head = head.next;
            return;
        }
        if(cur.next == null){
            head = tail = null;
            return;
        }
        if(get(index) == -1) return;
        while(cur != null){
            if (i + 1 == index){
                if(cur.next == tail){
                    tail = cur;
                    cur.next = null;
                    return;
                }
                cur.next = cur.next.next;
                return;

            }
            cur = cur.next;
            i++;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */