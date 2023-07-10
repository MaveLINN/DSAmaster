class Solution {
    public String removeStars(String s) {
        
        String res ="";
        Stack<Character> st = new Stack<>();

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '*'){
                if(st.size() > 0)
                st.pop();
            }
            else st.push((char)s.charAt(i)) ;
        }

        while(!st.empty()) { res += (char)st.pop() ; }
        String reverse = new StringBuilder(res).reverse().toString();
        return reverse ;
        
    }
}
