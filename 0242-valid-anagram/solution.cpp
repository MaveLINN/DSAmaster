class Solution {
public:
    bool isAnagram(string s, string t) {

        vector<int> v(26) ;
        if(s.size() != t.size())return false ; 
        for(int i = 0 ; i < s.size() ; i++) v[s[i]-97]++ , v[t[i]-97]-- ;
        for(auto i : v)if(i != 0)return false ;
        return true ;    
    }
};
