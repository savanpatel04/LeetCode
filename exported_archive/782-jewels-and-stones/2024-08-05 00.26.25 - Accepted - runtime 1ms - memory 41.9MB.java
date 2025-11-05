class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> hSet = new HashSet<>();

        for(char c: jewels.toCharArray()){
            hSet.add(c);
        }

        int result = 0;
        for(char c: stones.toCharArray()){
            if(hSet.contains(c)){
            result++;}
        }
        

        return result;
    }
}