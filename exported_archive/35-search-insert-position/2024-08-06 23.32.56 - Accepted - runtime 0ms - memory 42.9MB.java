class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;
        int m = 0;
        while(l <= h){
             m = (l + h) / 2;
          
            if(nums[m] > target){
                h = m - 1;
            }else if(nums[m] < target){
                l = m + 1;
            }else{
                return m;
            }
        } 

        return l;
    }
}