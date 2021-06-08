class Solution {
public:
    string minRemoveToMakeValid(string s) {
        const int n = s.size();
        stack<pair<char,int>> st ;
        
        for(int i = 0 ; i < n ; i++){
            
            if(s[i] == '(')st.push({'(',i});
            else if(s[i] == ')'){
                if(st.size() == 0)st.push({')',i});
                else{
                    if(st.top().first == '(')st.pop();
                    else st.push({')',i});
                }
            }
            
        }
        
        while(!st.empty()){
            int x = st.top().second ; st.pop();
            s[x]='#';
        }
        
        string res="";
        for(auto i : s){
            if(i != '#')res += i ;
        }
        return res ;
    }
};
