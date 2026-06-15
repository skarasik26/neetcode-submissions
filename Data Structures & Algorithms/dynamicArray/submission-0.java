class DynamicArray {
    private int[] arr;
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
        arr = new int[capacity];
        this.capacity = capacity;
        size = 0;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if (size == capacity){
            resize();
        }
        arr[size] = n;
        size++;
    }

    public int popback() {
        size--;
        return arr[size];
    }

    private void resize() {
        capacity *= 2;
        int[] temp = new int[capacity];
        for (int i = 0; i < size; i++){
            temp[i] = arr[i];
        }
        arr = temp;

    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
