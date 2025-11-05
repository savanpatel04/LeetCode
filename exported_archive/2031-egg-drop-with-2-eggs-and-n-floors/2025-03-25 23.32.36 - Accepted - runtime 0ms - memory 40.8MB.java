class Solution {
    public int twoEggDrop(int n) {
        int k = 0, sum = 0;
        while (sum < n) {
            k++;
            sum += k;
        }
        return k;
    }
}