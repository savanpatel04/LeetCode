class Solution {
    public boolean isPalindrome(int x) {
      
      int sum = 0;
      int n,i =x;
      boolean flg = false;
    
       while(x>0){
           n = x % 10;
           sum= (sum * 10) + n;
           x = x / 10;
       }
       
       if (i == sum){
           //System.out.println(sum);
           flg = true;
       }

       return flg;
    }
}