class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b - a);

        for(int n : stones){
            maxHeap.offer(n);
            
        }
        while(maxHeap.size() > 1){
           
            int large = maxHeap.poll();
            int secondlarge = maxHeap.poll();
            
            if(large != secondlarge){
                maxHeap.offer(large - secondlarge);
            }
        }

        return maxHeap.isEmpty() ? 0: maxHeap.peek();
    }
}