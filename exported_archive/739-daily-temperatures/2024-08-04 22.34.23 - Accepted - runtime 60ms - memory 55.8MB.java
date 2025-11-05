class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
     int n = temperatures.length;
     int[] result = new int[n];

     Stack<int[]> stk = new Stack<>();

     for(int i =0; i < n;i++){
        int temp = temperatures[i];

        while(!stk.isEmpty() && stk.peek()[0] < temp){
            int[] prev = stk.pop();
            result[prev[1]] = i - prev[1];
        }

        stk.push(new int[]{temp,i});
     }
     return result;

    }
}