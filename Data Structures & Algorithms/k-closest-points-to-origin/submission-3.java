class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b) -> {
            if(distance(a[0],a[1]) < distance(b[0], b[1])){
                return -1;
            } else if(distance(a[0],a[1]) > distance(b[0], b[1])){
                return 1;
            } else return 0;
        });

        for(int[] p : points){
            q.add(p);
        }

        int[][] l = new int[k][2];
        for(int i = 0; i < l.length; i++){
            l[i] = q.poll();
        }
        return l;

    }

    private double distance(int p1, int p2){
        return Math.pow(p1, 2) + Math.pow(p2, 2);
    }
}
