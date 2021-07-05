class Solution {
public:
    vector<vector<int>> groupThePeople(vector<int>& groupSizes) {
        const int n = groupSizes.size();
        map<int,vector<int>> mp ;
        vector<vector<int>> res ;
        
        for(int i = 0 ; i < n ; i++){
            if(mp[groupSizes[i]].size() == groupSizes[i] ){
                res.push_back(mp[groupSizes[i]]);
                mp[groupSizes[i]].clear();
            }
            mp[groupSizes[i]].push_back(i) ;
        }
        
        for(auto &i : mp){
            res.push_back(i.second);
        }
        
        return res ; 
    }
};
