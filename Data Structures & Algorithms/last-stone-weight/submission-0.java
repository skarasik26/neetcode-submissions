class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int s : stones){
            q.add(s);
        }
        while(q.size() > 1){
            int temp = q.poll();
            if(temp == q.peek()){
                q.poll();
            }
            else{
                q.add(temp - q.poll());
            }
        }
        if(q.size() == 0) return 0;
        return q.poll();
    }
}
