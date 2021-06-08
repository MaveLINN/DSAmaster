class Solution {
public:
    string reverseParentheses(string s) {
        const int n = s.size();
        stack<int> st ;
        
        for(int i = 0 ; i < n ; i++){
            if(s[i] == '(')st.push(i);
            else if(s[i] == ')'){
                int x = st.top() ; st.pop();
                reverse(s.begin() + x + 1 , s.begin() + i) ;
            }
        }
        string res="";
        for(auto i : s){
            if( i != '(' and i != ')') res += i ;
        }
         return res ;
    }
};
