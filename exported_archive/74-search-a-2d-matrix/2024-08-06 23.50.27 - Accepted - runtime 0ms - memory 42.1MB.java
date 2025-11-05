class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int l = 0;
        int h = m * n - 1;
       
        while(l <= h){
             m = (l + h) / 2;
             int i = m / n;
             int j = m % n; 
            if(matrix[i][j] > target){
                h = m - 1;
            }else if(matrix[i][j] < target){
                l = m + 1;
            }else{
                return true;
            }
        } 

        return false;
    }
}