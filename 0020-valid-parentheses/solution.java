class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<Character>();

        char[] chars = s.toCharArray();
        for(char c : chars){
            if(c == '{' || c == '[' || c == '(')
                stack.push(c);
            else if(stack.isEmpty())return false ;
            else{
                char check = stack.pop();
                if(c == ']' && check != '[')return false;
                if(c == '}' && check != '{')return false;
                if(c == ')' && check != '(')return false;
            }
        }
        if(!stack.isEmpty())return false;
        return true ;
        
    }
}
