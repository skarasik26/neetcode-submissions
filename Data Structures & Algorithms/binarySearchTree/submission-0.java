class TreeMap {
    private class Node{
        int val, key;
        Node left;
        Node right;

        public Node(int key, int val){
            this.val = val;
            this.key = key;
        }
    }

    Node root;
    public TreeMap() {

    }

    public void insert(int key, int val) {
        root = insert(root, key, val);
    }

    private Node insert(Node root, int key, int val){
        if (root == null) return new Node(key, val);

        if(key > root.key){
            root.right = insert(root.right, key, val);
        }
        else if(key < root.key){
            root.left = insert(root.left, key, val);
        }else {
            root.val = val;
        }
        return root;
    }

    public int get(int key) {
        return get(root, key);
    }

    private int get(Node root, int key){
        if (root == null) return -1;

        if(key > root.key){
            return get(root.right, key);
        }
        else if(key < root.key){
            return get(root.left, key);
        }
        return root.val;
    }

    public int getMin() {
        if(root == null) return -1;
        Node cur = root;
        while(cur.left != null){
            cur = cur.left;
        }
        return cur.val;
    }

    public int getMax() {
        if(root == null) return -1;
        Node cur = root;
        while(cur.right != null){
            cur = cur.right;
        }
        return cur.val;
    }

    public void remove(int key) {
       root = remove(root, key);
    }

    private Node remove(Node root, int key){
        if(root == null) return null;

        if(key > root.key){
            root.right = remove(root.right, key);
        }else if(key < root.key){
            root.left = remove(root.left, key);
        }else{
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            else{
                Node min = min(root.right);
                root.val = min.val;
                root.key = min.key;
                root.right = remove(root.right, min.key);
            }
        }
        return root;
    }

    private Node min(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public List<Integer> getInorderKeys() {
        List<Integer> l = new ArrayList<>();
        inOrder(l, root);
        return l;
    }

    public void inOrder(List<Integer> l, Node root){
        if(root == null) return;

        inOrder(l, root.left);
        l.add(root.key);
        inOrder(l, root.right);
    }
}
