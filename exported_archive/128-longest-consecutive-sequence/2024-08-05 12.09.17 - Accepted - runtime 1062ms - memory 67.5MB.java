class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 0;
        HashSet<Integer> hset = new HashSet<>();

        for(int n : nums){
            hset.add(n);
        }
        for(int n : nums){
            if(!hset.contains(n -1)){
                int length = 1;
                int nextNum = n + 1;
                while(hset.contains(nextNum)){
                    length++;
                    nextNum++;
                }
                count = Math.max(count, length);
            }
        }

        return count;
    }
}