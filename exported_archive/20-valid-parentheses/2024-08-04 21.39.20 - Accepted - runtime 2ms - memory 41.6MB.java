class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> hmap = new HashMap<>();
        hmap.put(')','(');
        hmap.put('}','{');
        hmap.put(']','[');

        Stack<Character> stk = new Stack<>();

        for(char c: s.toCharArray()){
            if(!hmap.containsKey(c)){
                stk.push(c);
            }else{
                if(stk.isEmpty() || stk.pop() != hmap.get(c)){
                    return false;
                }
            }
        }

        return stk.isEmpty();
    }
}