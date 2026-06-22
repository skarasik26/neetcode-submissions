class Solution {
    public int[][] kClosest(int[][] points, int k) {
        if(points.length <= 1) return points;
        quickSort(points, 0, points.length - 1, k);
        int[][] res = new int[k][2];
        for(int i = 0; i < res.length; i++){
            res[i] = points[i];
        }
        return res;
    }
    private int[][] quickSort(int[][] points, int start, int end, int k){
        if(end - start + 1 <= 1) return points;
        int[] pivot = points[end];
        int left = start;

        for(int i = start; i < end; i++){
            if(distance(points[i][0], points[i][1]) < distance(pivot[0], pivot[1])){
                int[] temp = points[i];
                points[i] = points[left];
                points[left] = temp;
                left++;
            }
        }

        points[end] = points[left];
        points[left] = pivot;

        if(left == k - 1) return points;
        else if(left > k - 1) quickSort(points, start, left - 1, k);
        else quickSort(points, left + 1, end, k);

        return points;

    }

    private double distance(int p1, int p2) {
        return Math.hypot(p1, p2);
    }
}
