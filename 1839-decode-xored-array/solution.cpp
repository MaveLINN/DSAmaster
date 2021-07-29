class Solution {
public:
    vector<int> decode(vector<int>& encoded, int first) {
        vector<int> res ;
        res.push_back(first);
        
        for(auto &i : encoded){
            first ^= i;
            res.push_back(first);
        }
        
        return res ;
    }
};
