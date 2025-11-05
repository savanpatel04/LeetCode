class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        double med;
        int[] merge = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, merge, 0, nums1.length); 
        System.arraycopy(nums2, 0, merge, nums1.length, nums2.length);
        Arrays.sort(merge);
        int le = merge.length;
        if(merge.length % 2 == 0){
           med =(double)(merge[(int)le/2] + merge[((int)le/2)-1]) / 2;
        }else{
            med = merge[le / 2];
        }
        return med;
    }
}