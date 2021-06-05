class Solution {
public:
    bool isValid(string s) {
        const int n = s.size();
        stack<int>  st ;
        char x ;
        
        for(int i = 0 ; i < n ; i++){
            if(s[i] == '{' || s[i] == '(' || s[i] == '['){
                st.push(s[i]);
                continue;
            }
            
            if(st.empty()) return false ;
            
            switch(s[i]){
                    
                case '}' :
                    x = st.top() ; st.pop();
                    if(x == '(' || x =='[') return false ;
                    break;
                    
                case ')' :
                    x = st.top() ; st.pop();
                    if(x == '{' || x =='[') return false ;
                    break;
                    
                case ']' :
                    x = st.top() ; st.pop();
                    if(x == '{' || x =='(') return false ;
                    break;
                    
            }
        }
        
        return st.empty() ;
        
    }
};
