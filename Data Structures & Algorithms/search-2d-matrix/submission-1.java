class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int l = 0;
        int r = rows * cols - 1;
        int m;
        while(l <= r){
            m = (r + l)/2;

            int val = matrix[m/cols][m%cols];

            if(target < val){
                r = m - 1;
            } else if (target > val){
                l = m + 1;
            } else return true;
        }
        return false;
    }
}
