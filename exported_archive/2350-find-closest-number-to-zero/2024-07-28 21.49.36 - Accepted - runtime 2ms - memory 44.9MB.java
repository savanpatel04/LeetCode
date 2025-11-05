class Solution {
    public int findClosestNumber(int[] nums) {
        int diff = Math.abs(nums[0]);
        int closet_num = 0;
        for(int i = 0; i < nums.length; i++){
           if (diff >= Math.abs(nums[i]))
           {
            diff = Math.abs(nums[i]);
            if(closet_num == Math.abs(nums[i])){
                closet_num = Math.abs(nums[i]);
            }else{
               closet_num = nums[i];
            }
           }
        }

        return closet_num;
    }
}