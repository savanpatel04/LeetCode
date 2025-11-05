class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Map<Integer, Integer> indexMap = new HashMap<>();
        int n = nums.length;

        for(int i =0; i < n; i++){
            indexMap.put(nums[i], i);
        }
   
        for(int i=0; i < n; i++){
            for(int j=i+1; j < n; j++){
                int desired = -nums[i] - nums[j];
                if(indexMap.containsKey(desired) && indexMap.get(desired) != i && indexMap.get(desired) != j){
                    List<Integer> tri = Arrays.asList(nums[i], nums[j], desired);
                    Collections.sort(tri);
                    result.add(tri);
                }
            }
        }

        return new ArrayList<>(result);
    }
}