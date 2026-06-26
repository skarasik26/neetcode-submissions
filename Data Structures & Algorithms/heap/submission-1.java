class MinHeap {
    List<Integer> heap = new ArrayList<>();
    public MinHeap() {
        heap.add(0);
    }

    public void push(int val) {
        heap.add(val);
        int i = heap.size() - 1;
        while(i / 2 > 0){
            if(heap.get(i) < heap.get(i / 2)){
                int temp = heap.get(i / 2);
                heap.set(i / 2, heap.get(i));
                heap.set(i, temp);
                i /= 2;
            } else break;
        }
    }

    public Integer pop() {
        if(heap.size() == 1) return -1;
        if(heap.size() == 2) return heap.remove(1);
        int res = heap.get(1);

        heap.set(1, heap.remove(heap.size() - 1));

        int i = 1;
        helper(i, heap);
        return res;
    }

    public Integer top() {
        if(heap.size() == 1) return -1;
        return heap.get(1);
    }

    public void heapify(List<Integer> nums) {
        if(nums.size() == 0) return;
        heap = nums;
        heap.add(heap.get(0));
        
        int i = heap.size() / 2;
        while(i > 0){
            helper(i, heap);
            i--;
        }
    }

    private void helper(int i, List<Integer> l){
        while(i * 2< l.size()){
            int child = i * 2;
            if(2 * i + 1 < l.size() && l.get(i * 2) > l.get(i * 2 + 1)){
                child += 1;
            }
            if(l.get(child) >= l.get(i)) break;
            int temp = l.get(i);
            l.set(i, l.get(child));
            l.set(child, temp);
            i = child;
        }
    }
}
