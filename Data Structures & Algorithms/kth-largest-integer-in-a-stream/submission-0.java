class KthLargest {
    int k;
    PriorityQueue<Integer> heap;
    public KthLargest(int k, int[] nums) {
        this.k= k;
        heap = new PriorityQueue<>();
        for(int num : nums){
            add(num);
        }
    }
    
    public int add(int val) {
        if(heap.size() < k) heap.add(val);
        else{
            if(val > heap.peek()){
                heap.poll();
                heap.add(val);
            }
        }
        return heap.peek();
    }
}
