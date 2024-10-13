class Solution {
public:
    bool isValid(string s) {
        stack<char> st ;
        for(int i = 0 ; i < s.size() ; i++)
        {
            if(s[i] == '(' || s[i] == '{' || s[i] == '[') st.push(s[i]) ; // open Parentheses always push to stack
            else if(st.empty()) return false ;   // if closed Parentheses comes and stack is empty then return false .
            else{
                char x = st.top() ;   // closed Parentheses comes here and if the stacks top ( open Parentheses ) does not matches with its closed Parentheses then return false . 
                if(s[i] == ']' and x != '[') return false;
                if(s[i] == ')' and x != '(') return false ;
                if(s[i] == '}' and x != '{') return false ;

                st.pop();  // if matched the pop the top and continue .
            }
        }

        return st.empty() ; // if stack remains empty then the answer is true else false .
    }
};
