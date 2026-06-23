class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix.length - 1;
        int m;
        int l2;
        int r2;
        int m2;
        while(l <= r){
            m = (r + l) / 2;
            l2 = 0;
            r2 = matrix[m].length - 1;
            

            while(l2 <= r2){
                m2 = (r2 + l2) / 2;
                if(target < matrix[m][m2]){
                    r2 = m2 - 1;
                } else if (target > matrix[m][m2]){
                    l2 = m2 + 1;
                }else return true;
            }

            if(target < matrix[m][0]){
                r = m - 1;
            } else if(target > matrix[m][matrix[m].length - 1]){
                l = m + 1;
            } else return false;
        }
        return false;
    }
}
