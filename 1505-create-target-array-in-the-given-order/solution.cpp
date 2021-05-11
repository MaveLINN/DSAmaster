class Solution {
public:
    vector<int> createTargetArray(vector<int>& a, vector<int>& idx) {
        
        vector<int>  v ;
        int k = 0 ;
        for(auto i : idx){
            v.insert(v.begin() + i , a[k++]);
        }
        
        return v ;
    }
};
