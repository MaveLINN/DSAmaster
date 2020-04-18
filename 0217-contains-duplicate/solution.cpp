class Solution {
public:
    bool containsDuplicate(vector<int>& v) {
        const int n = v.size() ;
        unordered_set<int > s ;
        for(auto i : v)
            s.insert(i);
        
        return n > s.size() ;
    } 
};
