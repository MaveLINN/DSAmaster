class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& v, int extraCandies) {
        
        auto mx = max_element(v.begin(),v.end());
        vector<bool> res ;
        for(auto &i : v){
            if(i+extraCandies >= *mx) res.push_back(true);
            else res.push_back(false);
        }
        return res ;
    }
};
