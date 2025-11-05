class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stk = new Stack<Integer>();

        for(String str: tokens){
            if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
              int a = stk.pop();
              int b = stk.pop();

              switch (str){
                case "+":
                      stk.push(b + a);
                      break;
                case "-":
                      stk.push(b - a);  
                      break;  
                case "*":
                      stk.push(b * a);
                      break;
                case "/":
                      stk.push(b / a);  
                      break;
                default:
                      break;                  
              }
            }else{
                stk.push(Integer.parseInt(str));
            }
        }

        return stk.pop();
    }
}