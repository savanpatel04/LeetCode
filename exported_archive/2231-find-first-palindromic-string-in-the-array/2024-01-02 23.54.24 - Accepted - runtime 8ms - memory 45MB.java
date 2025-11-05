class Solution {
    public String firstPalindrome(String[] words) {

        
        for(String str:words){
            StringBuilder sb= new StringBuilder(str);
            String res = sb.reverse().toString();
            if(str.equals(res)){
                return str;
            }
        }
        return "";
    }
}