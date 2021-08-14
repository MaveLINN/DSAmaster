class Solution {
public:
    string removeOuterParentheses(string s) {
    const int n = s.size();
        int ct = 0 ;
        string res = "";
        for(int i = 0 ; i < n ; i++){
            if(s[i] == '('){
                ct++;
                if(ct > 1) res += '(' ;
            }
            else {
                if(ct > 1)
                    res += ')';
                ct-- ;
            }
        }
        return res ;
    }
};
