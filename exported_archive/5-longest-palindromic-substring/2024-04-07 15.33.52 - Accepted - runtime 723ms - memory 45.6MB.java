class Solution {
    public String longestPalindrome(String s) {
     int i=0 , j = 0;
     String str= new String(s);
     String finalString=""; 
     while (i <= s.length() && i <= j && j <= s.length()){
        String sub = str.substring(i,j);
        if(isPalindrome(sub) && finalString.length() < sub.length()){
            finalString = sub.toString();
            if(finalString.length() == s.length()){
                break;
            }
        }
        j++;
        if(j == s.length()+1){
            i++;
            j=i;
        }   
     }
     return finalString;
    }

    private boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}