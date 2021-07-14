class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
    
        const int n = strs.size();
        string check(strs[0]);
        for(int i = 1 ; i < n ; i++){
            check = commonString(check,strs[i]);
        }
        return check ;
    }
    
    string commonString(string c , string s ){
        string res="";
        for(int i = 0 ; i < min(c.size(),s.size()) ; i++){
            if(s[i]==c[i])res+=s[i];
            else break;
        }
        return res ;
    }
    
    
};
