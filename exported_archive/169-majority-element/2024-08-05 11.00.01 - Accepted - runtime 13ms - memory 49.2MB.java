class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
       

        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int i:nums){
            hmap.put(i, hmap.getOrDefault(i,0) + 1);
        }

        for(Map.Entry<Integer, Integer> e : hmap.entrySet()){
           
            if(e.getValue() > n / 2){
                return e.getKey();
            }
        }
        return -1;
    }
}