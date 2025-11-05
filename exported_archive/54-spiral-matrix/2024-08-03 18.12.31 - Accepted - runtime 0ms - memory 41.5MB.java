class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m= matrix.length;
        int n = matrix[0].length;

        int top = 0;
        int down =  m - 1;
        int right = n - 1;
        int left = 0;

        while (top <= down && left <= right){
            //move rigth
            for(int i = left; i <= right; i++){
                result.add(matrix[top][i]);
            }
            top++;
            //move down
            for(int i = top; i <= down; i++){
                result.add(matrix[i][right]);
            }
            right--;
            //move left
            if(top<=down){
            for(int i =right; i >= left; i--){
                result.add(matrix[down][i]);
            }
            down--;}
            //move up
            if(left <= right){
            for(int i=down; i >= top; i--){
                result.add(matrix[i][left]);
            }
            left++;
            }
           
        }

        return result;
    }
}