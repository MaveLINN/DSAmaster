class Solution {
public:
    int minAddToMakeValid(string s) {
        const int n = s.size();
        stack<int> st ;
        
        int res=0;
        for(int i = 0 ; i < n ; i++){
            
            if(s[i] == '(')st.push(i);
            else{
                if(st.size() == 0) res++;
                else st.pop();
            }
            
        }
        
        return res + st.size() ;
        
    }
};
