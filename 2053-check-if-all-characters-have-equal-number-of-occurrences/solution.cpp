class Solution {
public:
    bool areOccurrencesEqual(string s) {
        const int n = s.size();
        vector<int> v(26,0);
        int ck = 0 ;
        for(auto &i : s){
            v[i-'a']++;
            ck = v[i-'a'];
        }
        

        for(int i = 0 ; i < 26 ; i++){
            if(v[i]){
                if(v[i] != ck) return false;
            }
            
        }
        return true ;
    }
};
