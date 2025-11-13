class Solution {
    public int[] sortedSquares(int[] nums) {
       int n = nums.length;
       int[] result = new int[n];
       int left = 0, right = n - 1, c = n -1;
       
       while(left <= right){
          if(Math.abs(nums[left]) > Math.abs(nums[right])){
            result[c] = nums[left] * nums[left];
            c--;
            left++;
          }else{
            result[c] = nums[right] * nums[right];
            c--;
            right--;
          }
       }

       return result;
    
    }
}