class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b - a);
        int n = nums.length;

        for(int i: nums){
            maxHeap.offer(i);
        }
  
        int result = 0;
        for(int j= 0; j < k; j++){
            result = maxHeap.poll();
        }

        return result;
    }
}