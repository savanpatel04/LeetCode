class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> hmap = new HashMap<>();

        for(char c: magazine.toCharArray()){
            hmap.put(c,hmap.getOrDefault(c,0)+1);
        }

        for(char c: ransomNote.toCharArray()){
            if(!hmap.containsKey(c) || hmap.get(c) == 0){
                return false;
            }
            hmap.put(c,hmap.get(c) - 1);
        }

        return true;
        
    }
}