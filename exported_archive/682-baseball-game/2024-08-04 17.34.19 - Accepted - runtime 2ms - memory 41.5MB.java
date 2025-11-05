class Solution {
    public int calPoints(String[] operations) {
        int result = 0;

        Stack<Integer> temp = new Stack<Integer>();

        for(String str: operations){
            if(str.equals("+")){
                int a= temp.pop();
                int b = temp.pop();
                temp.push(b);
                temp.push(a);
                temp.push(a+b);
            }else if(str.equals("D")){
                int a= temp.lastElement();
                temp.push(2 * a);
            }else if(str.equals("C")){
                temp.pop();
            }else{
                int a = Integer.parseInt(str);
                temp.push(a);
            }
        }

        while(!temp.isEmpty()){
           result += temp.pop();
        }

        return result;
    }
}