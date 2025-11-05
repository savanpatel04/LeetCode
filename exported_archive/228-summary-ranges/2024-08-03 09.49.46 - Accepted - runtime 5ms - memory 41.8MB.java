class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int n = nums.length;
        int i =0;
        String st="";
        int j =0;
        while(j < n){
             while(j < n - 1 && nums[j] + 1 == nums[j+1]){
               j++;
             }
             if(nums[j] == nums[i]){
                    st = String.valueOf(nums[i]);
                    result.add(st);
                    i = j+1;
              }else{
                    st = nums[i] + "->" + nums[j];
                    result.add(st);
                    i = j+1;
              } 
              j++;
        }
        return result;
    }
}