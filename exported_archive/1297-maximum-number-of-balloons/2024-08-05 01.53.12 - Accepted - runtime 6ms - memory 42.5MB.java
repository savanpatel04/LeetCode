class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> hmap = new HashMap<>();


        for(char c: text.toCharArray()){
            if(c == 'b' || c == 'a' || c == 'l' || c == 'o' || c == 'n'){
            hmap.put(c, hmap.getOrDefault(c,0) + 1);}
        }

        if(!hmap.containsKey('b') || !hmap.containsKey('a') || !hmap.containsKey('l') || !hmap.containsKey('o') || !hmap.containsKey('n')){
            return 0;
        }else{
            return Math.min(Math.min(hmap.get('b'),hmap.get('a')), Math.min(hmap.get('l')/2,Math.min(hmap.get('o')/2,hmap.get('n'))));
        }
        
    }
}