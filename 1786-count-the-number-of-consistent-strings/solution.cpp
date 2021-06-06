class Solution {
public:
    int countConsistentStrings(string allowed, vector<string>& words) {
        const int n = allowed.size() ;
        
        int res = words.size() ;
        vector<int> v(26,0);
        for(int i = 0 ; i < n ; i++){
            v[allowed[i]-'a']++;
        }
        
        for(int i = 0 ; i < words.size() ; i++){
            for(auto &j : words[i]){
                if(!v[j-'a']){res--;break;}
            }
        }
        
        return res ;
    }
};
