class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap<Character, Integer> hmap = new HashMap<>();
       HashMap<Character, Integer> hmap2 = new HashMap<>();


       if(s.length() != t.length()){
        return false;
       }

       for(char c: s.toCharArray()){
        hmap.put(c, hmap.getOrDefault(c,0) +1);
       } 

       for(char c: t.toCharArray()){
        hmap2.put(c, hmap2.getOrDefault(c,0) +1);
       }

       return hmap.equals(hmap2);
    }
}