class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& s) {

        unordered_map < string  , vector < string >> mp ;
        for(auto i : s ){
         string t(i);
            sort(t.begin(),t.end());
            mp[t].push_back(i);
        }
        
        vector < vector <string >> v ;
        for(auto i : mp){
            v.push_back( i.second) ;
        }
        
        return v ; 
    }
};
