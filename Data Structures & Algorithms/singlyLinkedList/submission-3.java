class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {

    }

    public int get(int index) {
        Node current = head;
        if(current == null) return -1;
        for(int i = 0; i < index; i++){
            if(current.next == null) return -1;
            current = current.next;
        }
        return current.data;
    }

    public void insertHead(int val) {
        if (head == null){
            head = new Node(val);
            tail = head;
        } else{
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
        }
    }

    public void insertTail(int val) {
        if (tail == null){
            tail = new Node(val);
            head = tail;
        }
        else{
            tail.next = new Node(val);
            tail = tail.next;
        }
    }

    public boolean remove(int index) {
        if (index < 0 || head == null){
            return false;
        }
        if (index == 0){
            head = head.next;
            return true;
        }
        Node current = head;
        for(int i = 0; i < index - 1; i++){
            if(current.next == null) return false;
            current = current.next;
        }
        if(current.next == null){
            return false;
        }
        if (current.next == tail) {
            tail = current;
        }

        current.next = current.next.next;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> temp = new ArrayList<>();
        Node current = head;
        while (current != null){
            temp.add(current.data);
            current = current.next;
        }
        return temp;

    }
    private class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
}
