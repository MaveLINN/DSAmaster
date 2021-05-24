class Solution {
public:
    vector<int> kWeakestRows(vector<vector<int>>& mat, int k) {
        const int n = mat.size();
        
        vector<pair<int,int>> v ;
        vector<int> res ;
        
        for(int i = 0 ; i < n ; i++){
            v.push_back({accumulate(mat[i].begin() , mat[i].end() , 0) , i});   
        }
        sort(v.begin(),v.end());
        for(auto i : v){
            if(res.size() == k) return res ;
            
            res.push_back(i.second);
        }
        
        return res ;
    }
};
