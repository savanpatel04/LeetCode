class Solution {
    public void nextPermutation(int[] nums) {

        int pivot = -1, n = nums.length;

        for(int i=n-2; i>=0;i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot == -1){
            int i =0, j = n-1;
            while(i<=j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
            return;
        }

        for(int j=n-1;j>pivot;j--){
            if(nums[j] > nums[pivot]){
                int temp= nums[pivot];
                nums[pivot] = nums[j];
                nums[j] = temp;
                break;
            }
        }

        int k = pivot + 1, l = n-1;
        while(k<=l){
            int temp = nums[k];
            nums[k] = nums[l];
            nums[l] = temp;
            k++;
            l--;
        }
        
    }
}