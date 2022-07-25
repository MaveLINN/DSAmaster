class Solution {
public:
    bool isAnagram(string s, string t) {
     
        vector<int> v(26) ;
        
        for(auto &i : s){
            v[i-97]++ ;
        }
        
        for(auto &i : t){
            v[i-97]-- ;
        }
        
        for(int i = 0 ; i < 26 ; i++){
            if(v[i]) return false ;
        }
        return true ;
    }
};
