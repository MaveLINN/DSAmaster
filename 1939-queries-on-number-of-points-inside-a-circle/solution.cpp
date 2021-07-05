class Solution {
public:
    vector<int> countPoints(vector<vector<int>>& points, vector<vector<int>>& queries) {
        const int n = points.size();
        const int q = queries.size();
        vector<int> res ; 
        
        
        for(int i = 0 ; i < q ; i++){
            int ct = 0 ;
            for(int j = 0 ; j < n ; j++){
                int x = abs(queries[i][0] - points[j][0]);
                int y = abs(queries[i][1] - points[j][1]);
                if(sqrt(x*x + y*y) <= queries[i][2])ct++;
            }
            res.push_back(ct);
        }
        
        return res ;
    }
};
