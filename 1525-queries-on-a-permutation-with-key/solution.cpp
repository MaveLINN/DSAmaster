class Solution {
public:
    vector<int> processQueries(vector<int>& queries, int m) {
        const int n = queries.size() ;
        vector<int> res , a ; 
        
        for(int i = 0 ; i < m ; i++){
            a.push_back(i+1);
        }
        
        for(int i  = 0 ; i < queries.size() ; i++){
            
            auto f = find(a.begin(),a.end(),queries[i]) ;
            int idx = f - a.begin();
            res.push_back(idx);
            a.erase(f);
            a.insert(a.begin(),queries[i]);
        }
        
        return res ;
    }
};
